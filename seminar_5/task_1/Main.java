package seminar_5.task_1;

public class Main {
    public static void main(String[] args){
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcContoller contoller = new CalcContoller(model, view);
        contoller.select();
    }
}
