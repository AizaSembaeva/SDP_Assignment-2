package Character;

public class Archer implements ICharacter {
    @Override
    public void attack(){
        System.out.println("I'm shooting with bow");
    }

    @Override
    public void defense(){
        System.out.println("I'm defending with bow");
    }

    @Override
    public void move(){
        System.out.println("I'm moving");
    }

    @Override
    public String getWeaponType() {
        return "Bow";
    }

    @Override
    public String getClassName() {
        return "Archer";
    }

    @Override
    public String toString() {
        return getClassName() + " (Weapon: " + getWeaponType() + ")";
    }
}