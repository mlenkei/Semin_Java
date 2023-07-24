package seminar_2.task_dz;

public class Horse extends The_brute implements IRunable, ISwimable, IJumping{
    
    private  int load_capacity;

    public Horse(String name, int box, int load_capacity) {
        super(name, box);
        this.load_capacity = load_capacity;
    }
    @Override
    public int speedOfSwim() {
        return 3;
    }
    @Override
    public int speedOfRun() {
        return 30;
    }
    @Override
    public int speedOfFly() {
        return 21;
    }
    @Override
    public String say() {
        return "Иго го";
    }
    @Override
    public String toString() {
        return String.format("Horse: %s, load_capacity: %s", super.toString(), this.load_capacity);
    }
}
