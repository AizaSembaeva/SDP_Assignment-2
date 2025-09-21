import Factory_Method.*;
import Abstract_Factory.*;
import Character.ICharacter;
import Race.IRace;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new ArcherFactory();
        ICharacter archer = characterFactory.createCharacter();
        System.out.println("Created: " + archer);
        archer.attack();
        archer.defense();
        archer.move();


        characterFactory = new MageFactory();
        ICharacter mage = characterFactory.createCharacter();
        System.out.println("Created:" + mage);
        mage.attack();
        mage.defense();
        mage.move();

        System.out.println("\n");



        WarriorFactory warriorFactory = new ElfSwordsman();

        IRace elfRace = warriorFactory.createRace();
        ICharacter swordsman = warriorFactory.createCharacter();

        System.out.println("Created: " + elfRace + " " + swordsman.getClassName());
        System.out.println("Weapon: " + swordsman.getWeaponType());

        elfRace.useRacialAbility();
        elfRace.battleCry();

        swordsman.attack();
        swordsman.defense();
        swordsman.move();

        System.out.println("\n");

        warriorFactory = new OrcMage();

        IRace orcRace = warriorFactory.createRace();
        ICharacter orcMage = warriorFactory.createCharacter();

        System.out.println("Created: " + orcRace + " " + orcMage.getClassName());
        System.out.println("Weapon: " + orcMage.getWeaponType());

        System.out.println("Race abilities");
        orcRace.useRacialAbility();
        orcRace.battleCry();

        System.out.println("Battle abilities");
        orcMage.attack();
        orcMage.defense();
        orcMage.move();
    }
}