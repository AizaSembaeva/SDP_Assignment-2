package Character;

public class Mage implements ICharacter {
    @Override
    public void attack(){
        System.out.println("I'm using spells");
    }

    @Override
    public void defense(){
        System.out.println("I'm defending with spells");
    }

    @Override
    public void move(){
        System.out.println("I'm moving");
    }

    @Override
    public String getWeaponType() {
        return "Spell";
    }

    @Override
    public String getClassName() {
        return "Mage";
    }

    @Override
    public String toString() {
        return getClassName() + " (Weapon: " + getWeaponType() + ")";
    }
}