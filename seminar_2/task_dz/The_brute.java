package seminar_2.task_dz;

public abstract class The_brute implements ISpeakable{

    private String name;
    private int box;

    public The_brute(String name, int box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        String text = String.format("name: %s, box: %d", this.name, this.box);

        return text;
    }

    public abstract String say();
}