package Factory_Method;

import Character.Archer;
import Character.ICharacter;

public class ArcherFactory extends CharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new Archer();
    }
}
