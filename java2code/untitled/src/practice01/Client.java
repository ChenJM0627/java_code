package practice01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.23.16.153",2019);
        FileInputStream fis = new FileInputStream("E:\\ccc.jpg");

        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println("01");
        while((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        System.out.println("02");
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        is.close();
        socket.close();
    }
}
