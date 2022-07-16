import java.util.Arrays;
import java.util.List;

public class XmlFormat implements Document {
    @Override
    public void start(StringBuilder sb) {
        sb.append("<xml>\n");
    }

    @Override
    public void add(StringBuilder sb, String... str) {
        String[] strings = Arrays.toString(str).split("\n");
        String[] substr;
        for (String s : strings) {
            substr = s.split("=");
            sb.append("    <").append(substr[0]).append(">").append(substr[1]).append("</").append(substr[0]).append(">\n");
        }
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</xml>\n");
    }
}
