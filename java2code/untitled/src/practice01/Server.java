package practice01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2019);
        Socket socket = server.accept();
        FileOutputStream fos = new FileOutputStream("D:\\002.jpg");
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println("03");
        while((len = is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        System.out.println("04");

        OutputStream os = socket.getOutputStream();
        os.write("get".getBytes());

        fos.close();
        os.close();
        socket.close();
        server.close();


    }
}
