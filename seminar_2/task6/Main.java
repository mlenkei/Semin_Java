package seminar_2.task6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();

        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}