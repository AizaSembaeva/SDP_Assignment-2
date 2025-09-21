package Race;

public class Elf implements IRace {
    @Override
    public void useRacialAbility(){
        System.out.println("Acceleration of attacks");
    }

    @Override
    public void battleCry(){
        System.out.println("For the glory of the Elves!");
    }

    @Override
    public String getRaceName() {
        return "Elf";
    }

    @Override
    public String toString() {
        return getRaceName();
    }
}