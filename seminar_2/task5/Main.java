package seminar_2.task5;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom");
        cat.makeSound();
        cat.sleep();

        Animal dog = new Dog("Max");
        dog.makeSound();
        dog.sleep();
    }
}
