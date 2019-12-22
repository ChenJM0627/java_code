package demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class demo_TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2048);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("D:\\upload");
        if(!file.exists()){
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file+"1.jpg");

        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("get it!!!".getBytes());

        fos.close();
        socket.close();
        server.close();

    }
}
