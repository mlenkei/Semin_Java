package seminar_2.task_dz;

public class Goat extends The_brute implements IRunable, ISwimable, IJumping {
    
    private int horns;

    public Goat(String name, int box, int horns) {
        super(name, box);
        this.horns = horns;
    }

    @Override
    public int speedOfFly() {
        return 1;
    }
    @Override
    public int speedOfSwim() {
        return 2;
    }

    @Override
    public int speedOfRun() {
        return 7;
    }

    @Override
    public String say() {
        return "Бе бе бе";
    }
    @Override
    public String toString() {
        return String.format("Goat: %s, horns: %s", super.toString(), this.horns);
    }
}
