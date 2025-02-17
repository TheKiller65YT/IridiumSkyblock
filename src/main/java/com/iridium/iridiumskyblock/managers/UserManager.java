package com.iridium.iridiumskyblock.managers;

import com.iridium.iridiumskyblock.IridiumSkyblock;
import com.iridium.iridiumskyblock.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;

public class UserManager {

    public static HashMap<UUID, User> cache = new HashMap<>();

    public static User getUser(String uuid) {
        return getUser(UUID.fromString(uuid));
    }


    //Gets a user from UUID
    public static User getUser(UUID uuid) {
        if (cache.containsKey(uuid)) return cache.get(uuid);
        try {
            Connection connection = IridiumSkyblock.getSqlManager().getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE UUID =?;");
            statement.setString(1, uuid.toString());

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                //There is a value
                User user = IridiumSkyblock.getPersist().gson.fromJson(resultSet.getString("json"), User.class);
                cache.put(uuid, user);
                connection.close();
                statement.close();
                return user;
            } else {
                //There is no value so create one
                PreparedStatement insert = connection.prepareStatement("INSERT INTO users (UUID,json) VALUES (?,?);");
                User user = new User(uuid);
                insert.setString(1, uuid.toString());
                insert.setString(2, IridiumSkyblock.getPersist().gson.toJson(user));
                insert.executeUpdate();

                cache.put(uuid, user);
                connection.commit();
                statement.close();
                connection.close();
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void saveUser(User user, Connection connection) {
        try {
            PreparedStatement insert = connection.prepareStatement("UPDATE users SET json = ? WHERE UUID = ?;");
            insert.setString(1, IridiumSkyblock.getPersist().gson.toJson(user));
            insert.setString(2, user.player);
            insert.executeUpdate();
            insert.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}