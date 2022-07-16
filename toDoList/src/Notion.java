import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Notion {
    private static int count = 0;
    private Map<String, String> items;
    private int id;
    private String task;
    private LocalDate addingEntry;
    private LocalTime timeOfAdding;
    private LocalDate deadline;
    private String author;
    private Priority priority;

    //какой-то громоздкий конструктор получился. Не уверен, можно ли передавать аргументы в виде массива.
    //Знаю, можно запуск программы с аргументами выполнить.
    public Notion(String[] node) {
        items = new HashMap<>();
        id = ++count;
        task = node[0];
        addingEntry = LocalDate.now();
        timeOfAdding = LocalTime.now();

        String[] date = node[1].split(","); //здесь возможен некорректный ввод данных от пользователя, тогда все
        //поломается. Можно обернуть в try/catch, чтобы приложение не вылетало с Exception
        deadline = LocalDate.of(
                Integer.parseInt(date[0]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[2]));
        author = node[2];

        long daysForTask = getDaysForTask(addingEntry, deadline);
        if (daysForTask <= 7) {
            priority = Priority.HIGH;
        } else if (daysForTask < 30) {
            priority = Priority.MEDIUM;
        } else {
            priority = Priority.LOW;
        }

        items.put("id", String.valueOf(id));
        items.put("задание", task);
        items.put("дата добавления", addingEntry.toString());
        items.put("время добавления", timeOfAdding.toString());
        items.put("дедлайн", deadline.toString());
        items.put("автор", author);
        items.put("приоритет выполнения", String.valueOf(priority));
    }

    private long getDaysForTask(LocalDate start, LocalDate end) {
        return end.toEpochDay() - start.toEpochDay();
    }

    public Map<String, String> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id).append("\n");
        sb.append("задание=").append(task).append("\n");
        sb.append("дата добавления=").append(addingEntry).append("\n");
        sb.append("время добавления=").append(timeOfAdding).append("\n");
        sb.append("дедлайн=").append(deadline).append("\n");
        sb.append("автор=").append(author).append("\n");
        sb.append("приоритет выполнения=").append(priority);
        return sb.toString();
    }

}
