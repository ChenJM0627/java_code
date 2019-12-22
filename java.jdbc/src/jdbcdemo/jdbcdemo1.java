package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcdemo1 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?serverTimezone=Asia/Shanghai", "root", "123");

        String sql = "update emp set salary = 1000 where id = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();
    }
}
