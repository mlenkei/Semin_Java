package seminar_2.task_dz;

public class Cow extends The_brute implements IRunable, ISwimable, IJumping {
   
    private int horns;

    public Cow(String name, int box, int horns) {
        super(name, box);
        this.horns = horns;
    }
    @Override
    public int speedOfFly() {
        return 1;
    }
    @Override
    public int speedOfSwim() {
        return 3;
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String say() {
        return "Му му";
    }
    @Override
    public String toString() {
        return String.format("Cow: %s, horns: %s", super.toString(), this.horns);
    }
}
