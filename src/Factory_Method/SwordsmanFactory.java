package Factory_Method;

import Character.ICharacter;
import Character.Swordsman;

public class SwordsmanFactory extends CharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new Swordsman();
    }

}
