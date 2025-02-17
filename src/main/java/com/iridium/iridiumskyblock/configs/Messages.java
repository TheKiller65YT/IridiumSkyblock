package com.iridium.iridiumskyblock.configs;

import com.iridium.iridiumskyblock.Role;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Messages {

    public String reloaded = "%prefix% &7Configuration reloaded.";
    public String noPermission = "%prefix% &7You don't have permission for that.";
    public String noIsland = "%prefix% &7You don't have an island.";
    public String playerNoIsland = "%prefix% &7That player does not have an island.";
    public String playerOffline = "%prefix% &7That player is currently offline.";
    public String alreadyHaveIsland = "%prefix% &7You already have an island.";
    public String playerAlreadyHaveIsland = "%prefix% &7This player already has an island.";
    public String notInYourIsland = "%prefix% &7This player is not a part of your island.";
    public String kickedMember = "%prefix% &7%member% has been kicked from your island.";
    public String youHaveBeenKicked = "%prefix% &7You have been kicked from your island.";
    public String mustBeAPlayer = "%prefix% &7You must be a player to execute this command.";
    public String mustBeIslandOwner = "%prefix% &7You must be the island owner to execute this command.";
    public String teleporting = "%prefix% &7Teleporting...";
    public String warpAdded = "%prefix% &7Warp added.";
    public String maxWarpsReached = "%prefix% &7Max warps reached.";
    public String flightDisabled = "%prefix% &7Your flight has been disabled.";
    public String flightEnabled = "%prefix% &7Your flight has been enabled.";
    public String flightBoosterNotActive = "%prefix% &7Your flight booster is not active.";
    public String notEnoughCrystals = "%prefix% &7You don't have enough island crystals.";
    public String playerNotEnoughCrystals = "%prefix% &7%player% doesn't have enough island crystals.";
    public String maxLevelReached = "%prefix% &7Maximum level reached.";
    public String crystalAmount = "%prefix% &7You have %crystals% crystals.";
    public String maxMemberCount = "%prefix% &7Maximum member count reached.";
    public String spawnerBoosterActive = "%prefix% &7Your spawner booster is already active.";
    public String farmingBoosterActive = "%prefix% &7Your farming booster is already active.";
    public String expBoosterActive = "%prefix% &7Your experience booster is already active.";
    public String flightBoosterActive = "%prefix% &7Your flight booster is already active.";
    public String noActiveInvites = "%prefix% &7You do not have any active invites for this island.";
    public String giveCrystals = "%prefix% &7You gave %player% %crystals% crystals.";
    public String givenCrystals = "%prefix% &7You have been given %crystals% crystals by %player%.";
    public String removedcrystals = "%prefix% &7You took %crystals% crystals from %player%.";
    public String resetCrystals = "%prefix% &7You've set %player%'s crystals to 0.";
    public String wrongPassword = "%prefix% &7Wrong password.";
    public String enterPassword = "%prefix% &7Enter password.";
    public String teleportingHome = "%prefix% &7Teleporting home...";
    public String playerInvited = "%prefix% &7You have invited a player to join your island.";
    public String invitedByPlayer = "%prefix% &7You have been invited to join %player%'s island.";
    public String leftIsland = "%prefix% &7You have left your island.";
    public String biomeChanged = "%prefix% &7%player% changed your island's biome to %biome%";
    public String biomePurchased = "%prefix% &7You purchased %biome% Biome for $%money%";
    public String regenIsland = "%prefix% &7Regenerating your island...";
    public String islandValue = "%prefix% &b&l * &7%rank%: &b%value%";
    public String playersIslandIsPrivate = "%prefix% &7That player's island is private.";
    public String islandNowPrivate = "%prefix% &7Your island is now private and %amount% players have been expelled from your island";
    public String islandNowPublic = "%prefix% &7Your island is now public.";
    public String cantLeaveIfOwner = "%prefix% &7You cannot leave your island whilst owner. do /is delete instead.";
    public String cantKickOwner = "%prefix% &7You cannot kick the island owner.";
    public String cantDemoteOwner = "%prefix% &7You cannot demote the island owner.";
    public String nowBypassing = "%prefix% &7You are now bypassing island restrictions.";
    public String noLongerBypassing = "%prefix% &7You are no longer bypassing island restrictions.";
    public String cantDemoteUser = "%prefix% &7You cannot demote this user.";
    public String cantPromoteUser = "%prefix% &7You cannot promote this user.";
    public String playerPromoted = "%prefix% &7%player% has been promoted to %rank%.";
    public String playerDemoted = "%prefix% &7%player% has been demoted to %rank%.";
    public String setHome = "%prefix% &7You have set your home to this location.";
    public String isNotSafe = "%prefix% &7This location is not safe.";
    public String helpMessage = "&b&l * &7 %command% : &b %description%";
    public String helpHeader = "&b&lIridiumSkyblock: &bHelp";
    public String transferdOwnership = "%prefix% &7Island ownership transferred to %player%.";
    public String bannedFromIsland = "%prefix% &7You have been banned from visiting this island.";
    public String playerBanned = "%prefix% &7You have banned %player% from visiting your island.";
    public String playerUnBanned = "%prefix% &7You have un-banned %player% from visiting your island.";
    public String playerJoinedYourIsland = "%prefix% &7%player% has joined your island.";
    public String joinedIsland = "%prefix% &7You have joined %player%'s island";
    public String coopAdded = "%prefix% &7You have granted %player%'s Island member permissions.";
    public String coopGiven = "%prefix% &7You have been granted Member permissions to %player%'s Island.";
    public String coopTaken = "%prefix% &7Your Member permissions have been removed for %player%'s Island.";
    public String coopInvite = "%prefix% &7You have been invited to coop %player%'s island.";
    public String coopInviteSent = "%prefix% &7Coop invitation send to %player%'s Island.";
    public String islandCreated = "&b&lIsland Created";
    public String islandCreatedSubtitle = "";
    public String maxlevelreached = "N/A";
    public String yes = "&a&lYes";
    public String no = "&c&lNo";
    public String islandNameTooLong = "%prefix% %name% is too long for the island name, The maximum size is %max_length%";
    public String islandNameTooShort = "%prefix% %name% is too short for the island name, The minimum size is %min_length%";
    public String changesIslandName = "%prefix% &7%player% changed your Island name to %name%";
    public String missionComplete = "&b&lMission Complete: &7%mission% Level %level%";
    public String rewards = "&b&lReward: &7%crystalsReward% Crystals and $%vaultReward%";
    public String chatFormat = "&b&l%player% &7» %message%";
    public String spyChatFormat = "[IsChatSpy] [ISLAND_NAME] &b&l%player% &7» %message%";
    public String chatDisabled = "%prefix% &7Your Island Chat has been disabled.";
    public String chatEnabled = "%prefix% &7Your Island Chat has been enabled.";
    public String chatSpyDisabled = "%prefix% &7Island Chat Spy has been disabled.";
    public String chatSpyEnabled = "%prefix% &7Island Chat Spy has been enabled.";
    public String transferAction = "Transfer ownership to %player%";
    public String resetAction = "Reset your Island";
    public String deleteAction = "Delete your Island";
    public String visitingIsland = "%prefix% &7Teleporting to %player%'s Island";
    public String visitedYourIsland = "%prefix% &7%player% is visiting your island.";
    public String cantBuy = "%prefix% &7You dont have enough money to buy this.";
    public String cantSell = "%prefix% &7You dont have this item to sell.";
    public String shopBoughtMessage = "%prefix% &7You bought x%amount% %item% for %crystals% crystals and $%money%";
    public String shopSoldMessage = "%prefix% &7You sold x%amount% %item% and got %crystals% crystals and $%money%";
    public String islandInterest = "%prefix% &7Your island interest has been applied giving you %crystals% Crystals, $%money%, and %exp% Experience.";
    public String helpfooter = "&b<< &7Page %page% of %maxpage% &b>>";
    public String previousPage = "<<";
    public String nextPage = ">>";
    public String Kick = "Kick";
    public String Demote = "Demote";
    public String completed = "Completed";
    public String regenCooldown = "%prefix% &7Island regeneration is on cooldown for %minutes% Minutes and %seconds% Seconds";
    public String createCooldown = "%prefix% &7Island creation is on cooldown for %minutes% Minutes and %seconds% Seconds";
    public String islandDeleted = "%prefix% &7Your island has been deleted";
    public String mustBeInIsland = "%prefix% &7You must be in your island to do this.";
    public String cannotSellItem = "%prefix% &7This is not a sellable item.";
    public String blockLimitReached = "%prefix% &7The island limit for this block has already been reached";
    public String unknownCommand = "%prefix% &7Unknown Command, Try /is help";
    public String noPermissionBuild = "%prefix% &7You do not have permission to build on this island";
    public String noPermissionBreakSpawners = "%prefix% &7You do not have permission to break spawners on this island";
    public String withdrawDisabled = "%prefix% &7Withdrawing and depositing money and crystals has been disabled by your administrator";
    public String depositedCrystals = "%prefix% &7You have deposited %amount% crystals into your island bank";
    public String helpPageHoverMessage = "Click to go to page %page%";
    public String calculatingIslands = "%prefix% &7Calculating %amount% Players islands, Estimated time: %minutes% Minutes and %seconds% Seconds";
    public String calculatingFinished = "%prefix% &7Calculating Players islands Finished";
    public String calculationAlreadyInProcess = "%prefix% &7Calculating Players islands already in Process";
    public String inventoryFull = "%prefix% &7Your inventory is full";
    public String islandUpgraded = "%prefix% &7%player% upgraded your island's %upgradename% Upgrade from level %oldlvl% to level %newlvl%";
    public String activatedBooster = "%prefix% &7%player% activated your islands %boostername% Booster";
    public String expelledIslandLocked = "%prefix% &7%player%'s island is now private";
    public String youHaveBeenExpelled = "%prefix% &7You were expelled from %kicker%'s island!";
    public String expelledVisitor = "%prefix% &7%player% has been expelled from your island.";
    public String cantExpelPlayer = "%prefix% &7%player% cannot be expelled!";
    public String cantExpelMember = "%prefix% &7%player% is in your island team";
    public String inviteHoverMessage = "Click to join players island!";
    public String notNumber = "%prefix% &7%error% is not a number!";
    public String coopHoverMessage = "Click to coop player's island!";
    public String addedValue = "%prefix% &7%value% will be added to %player%'s island value on the next value update";
    public String removedValue = "%prefix% &7%value% will be removed from %player%'s island value on the next value update";
    public String notEnoughValue = "%prefix% &7%player%'s island does not have that much value!";
    public String purgingIslands = "%prefix% &7purging islands, Estimated time: %minutes% Minutes and %seconds% Seconds";
    public String purgingFinished = "%prefix% &7Purging islands Finished. Purged %amount% Islands";
    public String purgingAlreadyInProcess = "%prefix% &7Purging islands already in Process";

    public List<String> stackedBlocksHologram = Arrays.asList("&b&l [{amount}X] &b{block}");

    public Map<Role, String> roles = new HashMap<Role, String>() {{
        for (Role role : Role.values()) {
            put(role, role.name());
        }
    }};

    public Map<String, String> permissions = new HashMap<>();
}
