package seminar_2.task_dz;

public class Owner implements ISpeakable{
    
    private String name;

    public Owner() {
        this.name = name;
    }

    @Override
    public String say() {
        return "Всем привет";
    }
    @Override
    public int speedOfSwim() {
        return 10;
    }
    @Override
    public int speedOfFly() {
        return 15;
    }
}
