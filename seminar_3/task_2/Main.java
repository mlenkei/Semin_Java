package seminar_3.task_2;

public class Main {
    public static void main(String[] args) {
        ITest<Integer> test = (n, d) -> n % d == 0;
        ITest<Double> test1 = (k, l) -> k > l;

        System.out.println(test.test(15, 3));
        System.out.println(test1.test(20.98, 23.12));
    }
}
