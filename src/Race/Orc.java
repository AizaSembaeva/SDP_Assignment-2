package Race;

public class Orc implements IRace{
    @Override
    public void useRacialAbility(){
        System.out.println("Strengthening basic defense");
    }

    @Override
    public void battleCry(){
        System.out.println("Blood and honor!");
    }

    @Override
    public String getRaceName() {
        return "Orc";
    }

    @Override
    public String toString() {
        return getRaceName();
    }
}