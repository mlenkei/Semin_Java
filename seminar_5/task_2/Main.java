package seminar_5.task_2;
/**
 * Класс, представляющий основной запуск программы и связывание Model, View и Presenter.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр представления для ввода и вывода
        ConsoleCalculatorView inputView = new ConsoleCalculatorView();
        ConsoleCalculatorView outputView = new ConsoleCalculatorView();

        // Создаем экземпляр модели данных
        CalculatorPresenter model = new CalculatorPresenter();

        // Создаем презентер, передавая ему экземпляры представления и модели данных
        CalculatorPresenter presenter = new CalculatorPresenterImpl(inputView, outputView, model);

        // Запускаем выполнение расчета
        presenter.calculate();
    }
}