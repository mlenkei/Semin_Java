package seminar_5.task_2;
/**
 * Реализация Presenter (презентера) в архитектуре MVP для выполнения математических операций.
 *
 * Рефакторинг 2: Использование интерфейсов для View и Presenter.
 * Это следует принципу "Dependency Inversion" из принципов SOLID, который гласит, что модули
 * верхнего уровня не должны зависеть от модулей нижнего уровня, оба типа модулей должны зависеть
 * от абстракций.
 * Рефакторинг 4: Разделение интерфейсов представления и модели данных.
 */
public class CalculatorPresenterImpl implements CalculatorPresenter {
    private CalculatorView inputView;
    private CalculatorView outputView;
    private CalculatorPresenter model;

    public CalculatorPresenterImpl(CalculatorView inputView, CalculatorOutputView outputView, CalculatorModel model) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.model = model;
    }

    @Override
    public void calculate() {
        double firstNumber = inputView.getFirstNumber();
        double secondNumber = inputView.getSecondNumber();
        char operation = inputView.getOperation();

        double result = model.performOperation(firstNumber, secondNumber, operation);

        outputView.showResult(result);
    }
}
