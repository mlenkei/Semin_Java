package seminar_3.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

// public interface Comparable<T> {
//     /**
//      * Сравнивает данный объект с указанным объектом для определения порядка.
//      *
//      * @param other объект для сравнения
//      * @return отрицательное целое число, ноль или положительное целое число,
//      *         если данный объект меньше, равен или больше указанного объекта.
//      */
//     int compareTo(T other);
// }
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Giraffe", 7));

        // Используем компаратор для сортировки по имени
        Comparator<Animal> nameComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };

    //     public interface Comparator<T> {
    // /**
    //  * Сравнивает два объекта для определения порядка.
    //  *
    //  * @param obj1 первый объект для сравнения
    //  * @param obj2 второй объект для сравнения
    //  * @return отрицательное целое число, ноль или положительное целое число,
    //  *         если obj1 меньше, равен или больше obj2.
    //  */
    // int compare(T obj1, T obj2);
        // Сортировка по имени
        Collections.sort(animals, nameComparator);

        // Вывод отсортированного списка
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}