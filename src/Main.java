import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        int port = 8080;
        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on " + port + " port");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}