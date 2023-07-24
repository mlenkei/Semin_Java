package seminar_2.task_dz;

public class Cat extends The_brute implements IRunable, IJumping{

    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }
    @Override
    public int speedOfFly() {
        return 8;
    }
    @Override
    public int speedOfRun() {
        return 15;
    }

    @Override
    public String say() {
        return "Мяу";
    }

    @Override
    public String toString() {
        return String.format("Cat: %s, colour: %s", super.toString(), this.color);
    }
}