package Character;

public class Swordsman implements ICharacter {
    @Override
    public void attack(){
        System.out.println("I'm attacking with sword");
    }

    @Override
    public void defense(){
        System.out.println("I'm defending with sword");
    }

    @Override
    public void move(){
        System.out.println("I'm moving");
    }

    @Override
    public String getWeaponType() {
        return "Sword";
    }

    @Override
    public String getClassName() {
        return "Swordsman";
    }

    @Override
    public String toString() {
        return getClassName() + " (Weapon: " + getWeaponType() + ")";
    }
}