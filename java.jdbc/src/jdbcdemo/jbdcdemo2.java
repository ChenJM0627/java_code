package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jbdcdemo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db1?serverTimezone=Asia/Shanghai", "root", "123");
            stmt = conn.createStatement();
            String sql = "delete from emp where id = 1";
            int count = stmt.executeUpdate(sql);
            System.out.println(count);
            if(count > 0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }
        }


    }
}
