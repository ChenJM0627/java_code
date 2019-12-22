package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcdemo4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入转出用户名");
        String name1 = sc.nextLine();
        System.out.println("请输入转入用户名");
        String name2 = sc.nextLine();
        System.out.println("请输入转出金额");
        Integer money = Integer.valueOf(sc.nextLine());

        Connection conn = null;

        PreparedStatement pstmt = null;
        PreparedStatement pstmt1 = null;

        conn = JDBCUtils.getConnection();

        try {
            conn.setAutoCommit(false);
            String sql = "update money set money = money-? where username = ? ";
            String sql1 = "update money set money = money+? where username = ? ";

            pstmt = conn.prepareStatement(sql);
            pstmt1 = conn.prepareStatement(sql1);

            pstmt.setInt(1,money);
            pstmt.setString(2,name1);

            pstmt1.setInt(1,money);
            pstmt1.setString(2,name2);

            pstmt.executeUpdate();
            pstmt1.executeUpdate();

            conn.commit();
        } catch (Exception e) {
            if(conn != null )
            {
                try {
                    conn.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            e.printStackTrace();

        }finally {


            try {
                pstmt.close();
                pstmt1.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }


    }
    
}
