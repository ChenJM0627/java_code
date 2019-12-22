package jdbcdemo;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.*;
import java.util.Scanner;

public class jdbcdemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();

        boolean flag = new jdbcdemo3().login2(username,password);

        if(flag == true){
            System.out.println("Right！！！");
        }else {
            System.out.println("Sorry! ! !");
        }


    }
    public boolean login(String username,String password)  {
        if(username == null || password == null){
            return false;
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        conn = JDBCUtils.getConnection();

        String sql = "select * from user where name = '"+username+"' and password = '"+password+"' ";

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);


            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(stmt,conn);
        }


        return false;

    }


    public boolean login2(String username,String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = JDBCUtils.getConnection();

        String sql = "select * from user where name = ? and password =  ? ";

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();


            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt, conn);
        }


        return false;
    }
}
