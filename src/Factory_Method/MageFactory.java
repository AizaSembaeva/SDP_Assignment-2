package Factory_Method;

import Character.ICharacter;
import Character.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new Mage();
    }
}
