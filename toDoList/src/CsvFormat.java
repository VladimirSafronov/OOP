import java.util.Arrays;
import java.util.List;

public class CsvFormat implements Document {

    @Override
    public void start(StringBuilder sb) {}

    @Override
    public void add(StringBuilder sb, String... str) {
        String[] data = Arrays.toString(str).split("\n");
        for (String d : data) {
            sb.append(d).append(";;;"); //я не сильно знаком с форматом csv, создам такие правила разделения
        }
    }

    @Override
    public void end(StringBuilder sb) {}
}
