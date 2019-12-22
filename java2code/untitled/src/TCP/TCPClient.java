package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读写服务器的回写数据
    表示客户端的类：
        java.net.Socket

    构造方法：Socket（String host，int port）
*/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.23.16.153",2048);
        OutputStream os = socket.getOutputStream();
        os.write("hi".getBytes());

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();
    }
}
