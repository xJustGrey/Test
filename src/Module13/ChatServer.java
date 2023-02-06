package Module13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
    ServerSocket serverSocket;
    ArrayList<Client> clients = new ArrayList<>();
    ChatServer() throws IOException {
        // создаем серверный сокет на порту 1234
        serverSocket = new ServerSocket(1234);
    }
    void sendAll (String msg){
    for (Client client : clients) {
        client.receive(msg);
    }
    }
    public void run() {
        while (true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // создаем клиента на своей стороне
                clients.add(new Client(socket, this));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer().run();
    }
}