package seminar_3.task_1;

public class Main {
    public static void main(String[] args) {
        IMyValue value;
        IMyValue myValue2;
        IMyValue myValue3;

        value = (m, n) -> {
            if (1 > 0) {
                System.out.println("1 > 0");
            }
            return m / n;
        };

        myValue2 = (x, y) -> x + y;
        myValue3 = (z, q) -> z * q;

        System.out.println(value.getValue(10.0, 2.0));
        System.out.println(myValue2.getValue(10.0, 2.0));
        System.out.println(myValue3.getValue(10.0, 2.0));
    }
}
