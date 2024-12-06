package com.abby226.abbyscustomitems.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    // CASUAL

    public static ItemStack ShinyCrystal;
    public static ItemStack BirthdayCake;
    public static ItemStack SecretKey;
    public static ItemStack ShinyShard;
    public static ItemStack Rose;
    public static ItemStack ComingSoon;
    public static ItemStack ODLantern;
    public static ItemStack BBQ;
    public static ItemStack BurntCinna;
    public static ItemStack TopSecret;
    public static ItemStack PurCrown;
    public static ItemStack ChristmasSnow;
    public static ItemStack UncleJoe;
    public static ItemStack HotPotato;
    public static ItemStack OldFeather;
    public static ItemStack OldReliable;
    public static ItemStack OldWhistle;
    public static ItemStack PandaBamboo;
    public static ItemStack GoatWheat;
    public static ItemStack RedApple;
    public static ItemStack MythicalStand;
    public static ItemStack GoldenDelApple;
    public static ItemStack VillagerMoney;
    public static ItemStack BeaconKitBeacon;
    public static ItemStack BeaconStack;
    public static ItemStack PartialBeaconOne;
    public static ItemStack BeaconFuel;
    public static ItemStack DinoBone;



    public static ItemStack ExplodingEmerald;
    public static ItemStack Bell;
    public static ItemStack ExplodingStar;
    public static ItemStack Otherside;
    public static ItemStack PigStep;
    public static ItemStack Relic;

    public static ItemStack MythicalHelmet;
    public static ItemStack MythicalChestplate;
    public static ItemStack MythicalLeggings;
    public static ItemStack MythicalBoots;
    public static ItemStack SlayerSword;
    public static ItemStack MinerPick;
    public static ItemStack WoodCutterAxe;
    public static ItemStack DiggersShovel;
    public static ItemStack SilkTouchPick;
    public static ItemStack FarmerHoe;
    public static ItemStack ObsidianSword;
    public static ItemStack ChromiumSword;
    public static ItemStack KBStick;

    public static ItemStack Wings;
    public static ItemStack TurtleShell;
    public static ItemStack Dinglehopper;

    public static ItemStack SantaSack;
    public static ItemStack ChristmasStar;
    public static ItemStack ThanksgivingTurkey;
    public static ItemStack NaughtyCoal;
    public static ItemStack TinyXTree;
    public static ItemStack Stockings;
    public static ItemStack SpookyWeb;
    public static ItemStack HalloweenPumpkin;
    public static ItemStack PumpkinStem;
    public static ItemStack GraveLantern;
    public static ItemStack BrewingPot;




    public static void init() {
        createShinyCrystal();
        createWings();
        createExplodingEmerald();
        createBell();
        createBirthdayCake();
        createExplodingStar();
        createOtherside();
        createPigStep();
        createSecretKey();
        createShinyShard();
        createRose();
        createRelic();
        createComingSoon();
        createODLantern();
        createBBQ();
        createBurntCinna();
        createTopSecret();
        createPurCrown();
        createChristmasSnow();
        createUncleJoe();
        createHotPotato();
        createOldFeather();
        createOldReliable();
        createOldWhistle();
        createPandaBamboo();
        createGoatWheat();
        createRedApple();
        createMythicalStand();
        createGoldenDelApple();
        createVillagerMoney();
        createDinoBone();

        // Beacon Kit


        createBeaconKitBeacon();
        createBeaconStack();
        createPartialBeaconOne();
        createBeaconFuel();



        // TOOLS AND ARMOR
        createWoodCutterAxe();
        createTurtleShell();

        createMythicalHelmet();
        createMythicalChestplate();
        createMythicalLeggings();
        createMythicalBoots();
        createSlayerSword();
        createMinerPick();
        createDiggerShovel();
        createDinglehopper();
        createSilkTouchPick();
        createFarmerHoe();
        createObsidianSword();
        createChromiumSword();

        // ENCHANTS



        // SEASONAL ITEMS
        createSantaSack();
        createChristmasStar();
        createThanksgivingTurkey();
        createNaughtyCoal();
        createTinyXTree();
        createStockings();
        createSpookyWeb();
        createHalloweenPumpkin();
        createPumpkinStem();
        createGraveLantern();
        createBrewingPot();
        createKBStick();



    }

    private static void createShinyCrystal() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oShiny Crystal");
        List<String> lore = new ArrayList<>();
        lore.add("§5A shiny crystal buried in the");
        lore.add("§5depths of the world.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ShinyCrystal = item;
    }

    private static void createWings() {
        ItemStack item = new ItemStack(Material.ELYTRA, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§d§oPair of Wings");
        List<String> lore = new ArrayList<>();
        lore.add("§5You have earned a Pair of Wings!");
        meta.setLore(lore);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        Wings = item;
    }

    private static void createExplodingEmerald() {
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§a§oExploding Emerald");
        List<String> lore = new ArrayList<>();
        lore.add("§5Emerald with hidden superpowers!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ExplodingEmerald = item;
    }

    private static void createExplodingStar() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§9§oExploding Star");
        List<String> lore = new ArrayList<>();
        lore.add("§5A star with hidden superpowers!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ExplodingStar = item;
    }

    private static void createSantaSack() {
        ItemStack item = new ItemStack(Material.BUNDLE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§c§oSanta's Sack");
        List<String> lore = new ArrayList<>();
        lore.add("§5Who knows what toys santa could");
        lore.add("§5be hiding in his magical sack.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SantaSack = item;
    }

    private static void createChristmasStar() {
        ItemStack item = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oChristmas Star");
        List<String> lore = new ArrayList<>();
        lore.add("§5Merry Christmas!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ChristmasStar = item;
    }

    private static void createThanksgivingTurkey() {
        ItemStack item = new ItemStack(Material.COOKED_CHICKEN, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oThanksgiving Turkey");
        List<String> lore = new ArrayList<>();
        lore.add("§5Happy Thanksgiving!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ThanksgivingTurkey = item;
    }

    private static void createNaughtyCoal() {
        ItemStack item = new ItemStack(Material.CHARCOAL, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oNaughty Coal");
        List<String> lore = new ArrayList<>();
        lore.add("§5Merry Christmas!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        NaughtyCoal = item;
    }

    private static void createTinyXTree() {
        ItemStack item = new ItemStack(Material.SPRUCE_SAPLING, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oTiny Christmas Tree");
        List<String> lore = new ArrayList<>();
        lore.add("§5Merry Christmas!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TinyXTree = item;
    }

    private static void createStockings() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oChristmas Stocking");
        List<String> lore = new ArrayList<>();
        lore.add("§5Merry Christmas!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Stockings = item;
    }

    private static void createSpookyWeb() {
        ItemStack item = new ItemStack(Material.COBWEB, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oSpooky Web");
        List<String> lore = new ArrayList<>();
        lore.add("§5Who knows what spider made this web?");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SpookyWeb = item;
    }

    private static void createHalloweenPumpkin() {
        ItemStack item = new ItemStack(Material.JACK_O_LANTERN, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oHalloween Pumpkin");
        List<String> lore = new ArrayList<>();
        lore.add("§5A very spooky pumpkin. It's also");
        lore.add("§5a good light source.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        HalloweenPumpkin = item;
    }

    private static void createPumpkinStem() {
        ItemStack item = new ItemStack(Material.SEA_PICKLE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oPumpkin Stem");
        List<String> lore = new ArrayList<>();
        lore.add("§5A stem that should go on a pumpkin, perhaps?");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PumpkinStem = item;
    }

    private static void createGraveLantern() {
        ItemStack item = new ItemStack(Material.SOUL_LANTERN, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oGrave Lantern");
        List<String> lore = new ArrayList<>();
        lore.add("§5A dim lantern that was found abandoned");
        lore.add("§5at the local graveyard.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GraveLantern = item;
    }

    private static void createBell() {
        ItemStack item = new ItemStack(Material.BELL, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBell");
        List<String> lore = new ArrayList<>();
        lore.add("§5Left click the air!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Bell = item;
    }

    private static void createWoodCutterAxe() {
        ItemStack item = new ItemStack(Material.NETHERITE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oWoodCutter's Axe");
        List<String> lore = new ArrayList<>();
        lore.add("§5Great for chopping down trees quickly!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        WoodCutterAxe = item;
    }

    private static void createTurtleShell() {
        ItemStack item = new ItemStack(Material.TURTLE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oTurtle Shell");
        List<String> lore = new ArrayList<>();
        lore.add("§5Can be worn as a helmet, too!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.THORNS, 3, false);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, false);
        meta.addEnchant(Enchantment.OXYGEN, 3, false);
        meta.addEnchant(Enchantment.WATER_WORKER, 1, false);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        TurtleShell = item;
    }

    private static void createBirthdayCake() {
        ItemStack item = new ItemStack(Material.CAKE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBirthday Cake");
        List<String> lore = new ArrayList<>();
        lore.add("§5Happy Birthday!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BirthdayCake = item;
    }

    private static void createOtherside() {
        ItemStack item = new ItemStack(Material.MUSIC_DISC_OTHERSIDE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oOtherside");
        List<String> lore = new ArrayList<>();
        lore.add("§5Legendary Music Disc!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Otherside = item;
    }

    private static void createPigStep() {
        ItemStack item = new ItemStack(Material.MUSIC_DISC_PIGSTEP, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oPigstep");
        List<String> lore = new ArrayList<>();
        lore.add("§5Legendary Music Disc!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        PigStep = item;
    }

    private static void createSecretKey() {
        ItemStack item = new ItemStack(Material.TRIPWIRE_HOOK, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oSecret Key");
        List<String> lore = new ArrayList<>();
        lore.add("§5Who knows what this key could unlock?");
        meta.setLore(lore);
        item.setItemMeta(meta);
        SecretKey = item;
    }

    private static void createShinyShard() {
        ItemStack item = new ItemStack(Material.ECHO_SHARD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oShiny Shard");
        List<String> lore = new ArrayList<>();
        lore.add("§5Looks pretty clean to me.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ShinyShard = item;
    }

    private static void createRose() {
        ItemStack item = new ItemStack(Material.RED_TULIP, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§c§oRose");
        List<String> lore = new ArrayList<>();
        lore.add("§5Watch out for it's thorns!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Rose = item;
    }

    private static void createRelic() {
        ItemStack item = new ItemStack(Material.MUSIC_DISC_RELIC, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oRelic");
        List<String> lore = new ArrayList<>();
        lore.add("§5Legendary Music Disc!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Relic = item;
    }

    private static void createComingSoon() {
        ItemStack item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oComing Soon!");
        List<String> lore = new ArrayList<>();
        lore.add("§5New Items Coming Soon!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ComingSoon = item;
    }

    private static void createMythicalHelmet() {
        ItemStack item = new ItemStack(Material.NETHERITE_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMythical Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Armor Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.WATER_WORKER, 1, false);
        meta.addEnchant(Enchantment.OXYGEN, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        MythicalHelmet = item;
    }

    private static void createMythicalChestplate() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMythical Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Armor Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        MythicalChestplate = item;
    }

    private static void createMythicalLeggings() {
        ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMythical Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Armor Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        MythicalLeggings = item;
    }

    private static void createMythicalBoots() {
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMythical Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Armor Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 10, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        MythicalBoots = item;
    }

    private static void createSlayerSword() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oSlayer's Sword");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        SlayerSword = item;
    }

    private static void createMinerPick() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMiner's Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        MinerPick = item;
    }

    private static void createDiggerShovel() {
        ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oDigger's Shovel");
        List<String> lore = new ArrayList<>();
        lore.add("§5Great for digging!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        DiggersShovel = item;
    }

    private static void createODLantern() {
        ItemStack item = new ItemStack(Material.BEACON, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oOutdoor Lantern");
        List<String> lore = new ArrayList<>();
        lore.add("§5A good source of light to keep the monsters away.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ODLantern = item;
    }

    private static void createBBQ() {
        ItemStack item = new ItemStack(Material.SMOKER, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oDad's BBQ Machine");
        List<String> lore = new ArrayList<>();
        lore.add("§5Dad's newest purchase.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BBQ = item;
    }

    private static void createBurntCinna() {
        ItemStack item = new ItemStack(Material.ANCIENT_DEBRIS, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBurnt Cinnamon Roll");
        List<String> lore = new ArrayList<>();
        lore.add("§5Looks like it was left in the");
        lore.add("§5microwave for way too long.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BurntCinna = item;
    }

    private static void createBrewingPot() {
        ItemStack item = new ItemStack(Material.CAULDRON, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oWitch's Brewing Pot");
        List<String> lore = new ArrayList<>();
        lore.add("§5Who knows what could be cooking in there?");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BrewingPot = item;
    }

    private static void createTopSecret() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§b§oTop Secret Mission");
        List<String> lore = new ArrayList<>();
        lore.add("§5This mission shall forever remain a secret.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        TopSecret = item;
    }

    private static void createDinglehopper() {
        ItemStack item = new ItemStack(Material.TRIDENT, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oThrowable Dinglehopper");
        List<String> lore = new ArrayList<>();
        lore.add("§5I would not recommend throwing it at other people.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addEnchant(Enchantment.IMPALING, 5, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        Dinglehopper = item;
    }

    private static void createPurCrown() {
        ItemStack item = new ItemStack(Material.MEDIUM_AMETHYST_BUD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§d§oPurple Crown");
        List<String> lore = new ArrayList<>();
        lore.add("§5A crown worn by the queen herself.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PurCrown = item;
    }

    private static void createChristmasSnow() {
        ItemStack item = new ItemStack(Material.SNOWBALL, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§b§oChristmas Snow");
        List<String> lore = new ArrayList<>();
        lore.add("§5Merry Christmas!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ChristmasSnow = item;
    }

    private static void createUncleJoe() {
        ItemStack item = new ItemStack(Material.PUMPKIN_PIE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oUncle Joe's Pumpkin Pie");
        List<String> lore = new ArrayList<>();
        lore.add("§5The best pumpkin pie in the world!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        UncleJoe = item;
    }

    private static void createOldFeather() {
        ItemStack item = new ItemStack(Material.BRUSH, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oOl' Fashion Feather Pen");
        List<String> lore = new ArrayList<>();
        lore.add("§5Very delicate and dusty.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        OldFeather = item;
    }

    private static void createOldReliable() {
        ItemStack item = new ItemStack(Material.WOODEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oOl' Reliable");
        List<String> lore = new ArrayList<>();
        lore.add("§5It's old but still works very well!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, false);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        OldReliable = item;
    }

    private static void createOldWhistle() {
        ItemStack item = new ItemStack(Material.GOAT_HORN, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oAncient Caveman Whistle");
        List<String> lore = new ArrayList<>();
        lore.add("§5Communication before languages were invented.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        OldWhistle = item;
    }

    private static void createHotPotato() {
        ItemStack item = new ItemStack(Material.FIRE_CHARGE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oHot Potato");
        List<String> lore = new ArrayList<>();
        lore.add("§5May burn hands if held for long periods of time.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        HotPotato = item;
    }

    private static void createSilkTouchPick() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oSilk Touch Miner's Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 7, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        SilkTouchPick = item;
    }

    private static void createFarmerHoe() {
        ItemStack item = new ItemStack(Material.NETHERITE_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oFarmer's Hoe");
        List<String> lore = new ArrayList<>();
        lore.add("§5Part of the Mythical Set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
        meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        FarmerHoe = item;
    }

    private static void createPandaBamboo() {
        ItemStack item = new ItemStack(Material.BAMBOO, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oPanda Bamboo");
        List<String> lore = new ArrayList<>();
        lore.add("§5A yummy treat for some adorable pandas.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PandaBamboo = item;
    }

    private static void createGoatWheat() {
        ItemStack item = new ItemStack(Material.WHEAT, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oGoat Wheat");
        List<String> lore = new ArrayList<>();
        lore.add("§5A yummy snack for the goats.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GoatWheat = item;
    }

    private static void createObsidianSword() {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oObsidian Sword");
        List<String> lore = new ArrayList<>();
        lore.add("§5A very hard sword to break.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        ObsidianSword = item;
    }
    private static void createChromiumSword() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oChromium Sword");
        List<String> lore = new ArrayList<>();
        lore.add("§5A near impossible sword to break.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 255, true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        ChromiumSword = item;
    }

    private static void createKBStick() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oPremium Stick");
        List<String> lore = new ArrayList<>();
        lore.add("§5Knock them back to narnia.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 50, true);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        KBStick = item;
    }

    private static void createRedApple() {
        ItemStack item = new ItemStack(Material.APPLE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§c§oRed Delicious Apple");
        List<String> lore = new ArrayList<>();
        lore.add("§5I wonder if it's as delicious as it's name says it is.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        RedApple = item;
    }

    private static void createMythicalStand() {
        ItemStack item = new ItemStack(Material.ARMOR_STAND, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oMythical Armor Stand");
        List<String> lore = new ArrayList<>();
        lore.add("§5Use the stand to show off the mythical armor set.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1 ,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        MythicalStand = item;
    }

    private static void createGoldenDelApple() {
        ItemStack item = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oGolden Delicious Apple");
        List<String> lore = new ArrayList<>();
        lore.add("§5I wonder if it's as delicious as it's name says it is.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GoldenDelApple = item;
    }

    private static void createVillagerMoney() {
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§a§oVillager Money");
        List<String> lore = new ArrayList<>();
        lore.add("§5Villagers tend to like many of these.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1 ,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        VillagerMoney = item;
    }

    private static void createBeaconKitBeacon() {
        ItemStack item = new ItemStack(Material.BEACON, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBeacon");
        List<String> lore = new ArrayList<>();
        lore.add("§5Beacon for the beacon kit.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BeaconKitBeacon = item;
    }

    private static void createBeaconStack() {
        ItemStack item = new ItemStack(Material.IRON_BLOCK, 64);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBeacon Blocks");
        List<String> lore = new ArrayList<>();
        lore.add("§5Blocks for the beacon kit.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BeaconStack = item;
    }

    private static void createPartialBeaconOne() {
        ItemStack item = new ItemStack(Material.IRON_BLOCK, 36);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBeacon Blocks");
        List<String> lore = new ArrayList<>();
        lore.add("§5Blocks for the beacon kit.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        PartialBeaconOne = item;
    }

    private static void createBeaconFuel() {
        ItemStack item = new ItemStack(Material.DIAMOND, 16);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oBeacon Fuel");
        List<String> lore = new ArrayList<>();
        lore.add("§5Fuel for the beacon kit.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        BeaconFuel = item;
    }

    private static void createDinoBone() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6§oDinosaur Bone");
        List<String> lore = new ArrayList<>();
        lore.add("§5This bone could possibly be from a T-Rex");
        lore.add("§5but I am not 100% sure.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        DinoBone = item;
    }


































}