package jdbcdemo;

import java.util.Date;

public class Emp {
    private int id = 0;
    private String name;
    private String gender;
    private double salary;
    private Date join_date;
    private int dept_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", join_date=" + join_date +
                ", dept_id=" + dept_id +
                '}';
    }
}
