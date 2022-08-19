import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filter {

    protected int trasher;

    public Filter(int trasher) {
        this.trasher = trasher;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.get();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();

        for (Integer i : source) {
            if (i >= trasher) {
                result.add(i);
            }
            logger.log("Элемент " + i + " оказался ниже порога фильтра");
        }
        return result;
    }
}
