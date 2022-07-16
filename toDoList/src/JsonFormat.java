import java.util.Arrays;
import java.util.List;

public class JsonFormat implements Document {
    @Override
    public void start(StringBuilder sb) {
        sb.append("{\n");
    }

    @Override
    public void add(StringBuilder sb, String... str) {
        String[] strings = Arrays.toString(str).split("\n");
        String[] substr;
        for (String s : strings) {
            substr = s.split("=");
            sb.append("    ").append("\"").append(substr[0]).append("\"").append(": ")
                    .append("\"").append(substr[1]).append("\"").append(",").append("\n");
        }
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("}\n");
    }
}
