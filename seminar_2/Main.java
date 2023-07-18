package seminar_2;

public class Main {
    public static void main(String[] args) {
        Test testObj = new Test();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + testObj.getNext());
        }
        System.out.println("Сброс!");
        testObj.reset();
        System.out.println("Начальное значение 100");
        testObj.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение " + testObj.getNext());
        }
    }
}



