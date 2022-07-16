import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String[] data1 = new String[]{"Вымыть пол", "2022,07,20", "Иванов Иван Иванович"};
        Notion firstTask = new Notion(data1);
        String[] data2 = new String[]{"Поклеить обои", "2022,08,10", "Петров Петр Петрович"};
        Notion secondTask = new Notion(data2);
        String[] data3 = new String[]{"Полететь в космос", "2022,10,20", "Белка и Стрелка"};
        Notion thirdTask = new Notion(data3);

        DocumentRender<CsvFormat> csv = new DocumentRender<>(new CsvFormat());
        csv.addItems(firstTask.toString());
        System.out.println(csv);


        DocumentRender<XmlFormat> xml = new DocumentRender<>(new XmlFormat());
        xml.addItems(secondTask.toString());
        System.out.println(xml);

        DocumentRender<JsonFormat> json = new DocumentRender<>(new JsonFormat());
        json.addItems(thirdTask.toString());
        System.out.println(json);
    }
}
