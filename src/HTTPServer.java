import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class HTTPServer {
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server started on port 8000");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                OutputStream out = clientSocket.getOutputStream();
                String response = "HTTP/1.1 200 OK\r\n\r\nHello World!";
                out.write(response.getBytes());
                out.flush();
                out.close();
                clientSocket.close();
            }
        }
    }
