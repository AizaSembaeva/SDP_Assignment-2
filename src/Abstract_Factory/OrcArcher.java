package Abstract_Factory;

import Race.Orc;
import Race.IRace;
import Character.ICharacter;
import Character.Archer;

public class OrcArcher implements WarriorFactory {
    @Override
    public IRace createRace(){
        return new Orc();
    }

    @Override
    public ICharacter createCharacter(){
        return new Archer();
    }
}
