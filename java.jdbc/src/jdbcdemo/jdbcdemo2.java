package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class jdbcdemo2{
    public static void main(String[] args) throws SQLException {
        List<Emp> list = new jdbcdemo2().findall();
        for( Emp i :list){
            System.out.println(i);

        }

    }

    public static List<Emp> findall() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        conn = JDBCUtils.getConnection();
        String sql = "select * from emp";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        List<Emp> list = new ArrayList<Emp>();
        while(rs.next()){
            Emp emp = new Emp();
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String gender = rs.getNString("gender");
            Double salary = rs.getDouble("salary");
            Date join_date = rs.getDate("join_date");
            int dept_id = rs.getInt("dept_id");
            emp.setDept_id(dept_id);
            emp.setGender(gender);
            emp.setId(id);
            emp.setJoin_date(join_date);
            emp.setName(name);
            emp.setSalary(salary);

            list.add(emp);

        }

        return list;
    }
}
