
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создание ServerSocket на порту 8080
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server started on port 8080");

        while (true) {
            // Принимем сокет для клиента
            Socket client = server.accept();
            System.out.println("Client connected: " + client.getInetAddress());

            // Получаем ответ от сервера
            String response = "Hello, World!";
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + response;

            // Отправляем на клиент
            OutputStream output = client.getOutputStream();
            output.write(httpResponse.getBytes());
            output.flush();

            // Отключаем соедениение
            client.close();
        }
    }
}