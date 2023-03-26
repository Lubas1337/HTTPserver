import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class HTTPClient {
    public static void main(String[] args) throws Exception {
        // Создаем URL на адрес сервера
        URL url = new URL("http://localhost:8080/");

        // Создаем соединение к сервером
        URLConnection conn = url.openConnection();

        // Создаем поток для чтения на сервера
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        // выводим его на консоль
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        // Закрываем поток
        in.close();
    }
}
