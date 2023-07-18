package seminar_2.task4;

public interface IUserId {
    int getUserId();

    // метод с реализацией по умолчанию (default)
    default int getAdminId() {
        return 1;
    }
}