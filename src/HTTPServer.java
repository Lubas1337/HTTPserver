import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class HTTPServer {
    public static void main(String[] args) throws IOException {
        // Создаем сокет на порту 8000
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started on port 8080");

        while (true) {
            // Ожидаем клиента
            Socket clientSocket = serverSocket.accept();

            // Получаем поток для отправки ответа клиенту
            OutputStream out = clientSocket.getOutputStream();

            // Формируем ответ HTTP 200 OK с сообщением "Hello World!"
            String response = "HTTP/1.1 200 OK\r\n\r\nHello World!";

            // Отправляем на клиенту
            out.write(response.getBytes());
            out.flush();

            // Закрываем поток и отсоединяемся
            out.close();
            clientSocket.close();
        }
    }
}
