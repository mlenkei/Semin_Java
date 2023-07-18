package seminar_2.task6;

interface Animal {
    void makeSound();
    void sleep();
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}