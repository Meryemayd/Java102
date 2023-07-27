package AdventureGame;

public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private boolean water;
    private boolean food;
    private boolean firewood;
    private String armorName;
    private int armorDefence;
    public Inventory(){
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor = new Armor(0,"Paçavra",0,0);
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Armor getArmor(){
        return armor;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public boolean getWater(){
        return water;
    }

    public void setWater(boolean water){
        this.water = water;
    }

    public boolean getFood(){
        return food;
    }

    public void setFood(boolean food){
        this.food = food;
    }

    public boolean getFirewood(){
        return firewood;
    }

    public void setFirewood(boolean firewood){
        this.firewood = firewood;
    }

    public String getArmorName(){
        return armorName;
    }

    public void setArmorName(String armorName){
        this.armorName = armorName;
    }

    public int getArmorDefence(){
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence){
        this.armorDefence = armorDefence;
    }
}
