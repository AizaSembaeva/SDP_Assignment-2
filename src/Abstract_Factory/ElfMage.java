package Abstract_Factory;

import Race.Elf;
import Race.IRace;
import Character.ICharacter;
import Character.Mage;

public class ElfMage implements WarriorFactory {
    @Override
    public IRace createRace(){
        return new Elf();
    }

    @Override
    public ICharacter createCharacter(){
        return new Mage();
    }
}
