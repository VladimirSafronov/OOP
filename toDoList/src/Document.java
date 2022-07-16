import java.util.List;
import java.util.Map;

interface Document {
    void start(StringBuilder sb);

    void add(StringBuilder sb , String... str);

    void end(StringBuilder sb);
}
