package net.minecraft.src;
import java.util.Random;

public  class mod_EmeraldTools extends BaseMod {
    public static final Item emeraldpickaxe = new ItemPickaxe (20000, EnumToolMaterial.EMP).setItemName("empk");
    public static final Item emeraldsword = new ItemSword (20001, EnumToolMaterial.EMP).setItemName("emsw");
    public static final Item emeraldaxe = new ItemAxe (20002, EnumToolMaterial.EMP).setItemName("emax");
    public static final Item emeraldshovel = new ItemHoe (20003, EnumToolMaterial.EMP).setItemName("emsh");
    public static final Item emeraldhoe = new ItemHoe (20004, EnumToolMaterial.EMP).setItemName("emho");
   //Armor
  	public static final Item EmeraldHelmet = (new ItemArmor(20005,EnumArmorMaterial.EMA ,5,0 ).setItemName("emhe"));
  	public static final Item EmeraldChestplate = (new ItemArmor(20006, EnumArmorMaterial.EMA ,5,1 ).setItemName("embd"));
  	public static final Item EmeraldPants = (new ItemArmor(20007,EnumArmorMaterial.EMA ,5,2 ).setItemName("empa"));
  	public static final Item EmeraldBoots = (new ItemArmor(20008,EnumArmorMaterial.EMA, 5, 3 ).setItemName("embo"));
    
  	//ACHIVEMENTS
  	
  	public static Achievement emeralds = new Achievement(1001, "mineem", -2, 3, Item.emerald, AchievementList.diamonds).registerAchievement();
	public static Achievement emeraldpick = new Achievement(1000, "craftem", -2, 1, mod_EmeraldTools.emeraldpickaxe, mod_EmeraldTools.emeralds).setSpecial().registerAchievement();
	
	//Mining Emeralds
	public void onItemPickup(EntityPlayer entityplayer, ItemStack itemstack)
	{
		if(itemstack.itemID == Item.emerald.itemID){
			entityplayer.addStat(emeralds, 1);
		}
	}
	
	//Crafting an Emerald Pick
	public void takenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
	{
		if(itemstack.itemID == mod_EmeraldTools.emeraldpickaxe.itemID){
			entityplayer.addStat(emeraldpick, 1);
		}
	}
  	
  	
    public void load()
    {
    	
    	ModLoader.addAchievementDesc(emeralds, "We need to get greener", "Acquire Emeralds!");
		ModLoader.addAchievementDesc(emeraldpick, "High Miner", "Craft an Emerald Pickaxe");
    	
    	//EmeraldPickaxe
        emeraldpickaxe.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldPickaxe.png");
        ModLoader.addName(emeraldpickaxe, "Emerald Pickaxe");
        ModLoader.addRecipe(new ItemStack(emeraldpickaxe, 1), new Object[]{
        "***", " $ ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        
        //EmeraldSword
        emeraldsword.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldSword.png");
        ModLoader.addName(emeraldsword, "Emerald Sword");
        ModLoader.addRecipe(new ItemStack(emeraldsword, 1), new Object[]{
        " * ", " * ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        
        //EmeraldAxe (craftingrecipe 1)
        emeraldaxe.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldAxe.png");
        ModLoader.addName(emeraldaxe, "Emerald Axe");
        ModLoader.addRecipe(new ItemStack(emeraldaxe, 1), new Object[]{
        " **", " $*", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        //EmeraldAxe (craftingrecipe 2)
        emeraldaxe.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldAxe.png");
        ModLoader.addName(emeraldaxe, "Emerald Axe");
        ModLoader.addRecipe(new ItemStack(emeraldaxe, 1), new Object[]{
        "** ", "*$ ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        
        //EmeraldShovel
        emeraldshovel.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldShovel.png");
        ModLoader.addName(emeraldshovel, "Emerald Shovel");
        ModLoader.addRecipe(new ItemStack(emeraldshovel, 1), new Object[]{
        " * ", " $ ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        
        emeraldhoe.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldHoe.png");
        ModLoader.addName(emeraldhoe, "Emerald Hoe");
        ModLoader.addRecipe(new ItemStack(emeraldhoe, 1), new Object[]{
        "** ", " $ ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
        
        emeraldhoe.iconIndex = ModLoader.addOverride("/gui/items.png" , "/items/EmeraldHoe.png");
        ModLoader.addName(emeraldhoe, "Emerald Hoe");
        ModLoader.addRecipe(new ItemStack(emeraldhoe, 1), new Object[]{
        " **", " $ ", " $ ", Character.valueOf('*'), Item.emerald, Character.valueOf('$'), Item.stick});
      //===ARMOR====  
        		// Emerald Helmet Armor
     			EmeraldHelmet.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/EmeraldHelmet.png");
     			ModLoader.addName(EmeraldHelmet, "Emerald Helmet");
     			ModLoader.addRecipe(new ItemStack(EmeraldHelmet,1), new Object[]{
     				"***", "* *", "   ", Character.valueOf('*'), Item.emerald});
     			
     			// Emerald Chest Armor
     			EmeraldChestplate.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/EmeraldChestplate.png");
     			ModLoader.addName(EmeraldChestplate, "Emerald Chestplate");
     			ModLoader.addRecipe(new ItemStack(EmeraldChestplate,1), new Object[]{
     				"* *", "***", "***", Character.valueOf('*'), Item.emerald});
     			
     			
     			// Emerald Pants Armor
     			EmeraldPants.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/EmeraldPants.png");
     			ModLoader.addName(EmeraldPants, "Emerald Pants");
     			ModLoader.addRecipe(new ItemStack(EmeraldPants,1), new Object[]{
     				"***", "* *", "* *", Character.valueOf('*'), Item.emerald});
     			
     			// Emerald Boots Armor
     			EmeraldBoots.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/EmeraldBoots.png");
     			ModLoader.addName(EmeraldBoots, "Emerald Boots");
     			ModLoader.addRecipe(new ItemStack(EmeraldBoots,1), new Object[]{
     				"   ", "* *", "* *", Character.valueOf('*'), Item.emerald});
     				
     			ModLoader.addArmor("emeraldarmor"); 

    }



    public String getVersion()
    {
        return "1.0";
    }


}