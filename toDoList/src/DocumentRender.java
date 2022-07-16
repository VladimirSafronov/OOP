import java.util.Collections;
import java.util.List;

public class DocumentRender <T extends Document>{
    private StringBuilder sb;
    private T docFormat;

    public DocumentRender(T format) {
        sb = new StringBuilder();
        docFormat = format;
    }

    public void addItems(String... str) {
        docFormat.start(sb);

        for(String s : str) {
            docFormat.add(sb, s);
        }

        docFormat.end(sb);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
