import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.get();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        System.out.println("Введите максимально допустимое целое значение");
        int m = scanner.nextInt();
        List<Integer> source = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            source.add((int) Math.round(Math.random() * m));
        }

        logger.log("Просим пользователя ввести входные данные фильтра");
        System.out.println("Введите нижний целочисленный порог для фильтра");
        Filter filter = new Filter(scanner.nextInt());

        source = filter.filterOut(source);

        logger.log("Выводим результаты на экран");

        System.out.println("Отфильтрованный список: " + source);
        logger.log("Завершаем программу");

    }
}
