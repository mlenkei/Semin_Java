package seminar_4.task_1;

public class Gen<T,V> {
    private T ob; // Обьект типа Т
    private V ob2;

    public Gen(T ob,V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    public T getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Тип Т это " + ob.getClass().getName() );
        System.out.println("Тип V это " + ob2.getClass().getName() );
    }

    public String getOb2() {
        return null;
    }
}
