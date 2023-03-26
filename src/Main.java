
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

            // Отключаем соедениение
            client.close();
        }
    }
}