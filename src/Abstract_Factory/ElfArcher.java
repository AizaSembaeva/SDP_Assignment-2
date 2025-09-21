package Abstract_Factory;

import Race.Elf;
import Race.IRace;
import Character.ICharacter;
import Character.Archer;

public class ElfArcher implements WarriorFactory {
    @Override
    public IRace createRace(){
        return new Elf();
    }

    @Override
    public ICharacter createCharacter(){
        return new Archer();
    }
}