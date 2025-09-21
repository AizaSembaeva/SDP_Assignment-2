package Abstract_Factory;

import Race.IRace;
import Character.ICharacter;

public interface WarriorFactory {
    IRace createRace();
    ICharacter createCharacter();
}
