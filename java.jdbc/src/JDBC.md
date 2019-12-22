# JDBC的使用教程
* 1.导入jar包  
    >1.复制jar包到libs文件夹中（方便管理）  
     2.右键--》Add as Library
    
* 2.注册驱动   
    ```
        Class.forName("com.mysql.jdbc.Driver");
     ```
* 3.获取数据库连接对象
    ```
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/deb1", "root", "password");
    ``` 
* 4.定义sql语句
    ```
    String sql = "update emp set salary = 1000 where id = 1";
    ```
* 5.获取执行sql的对象 Statement
    ```
    Statement stmt = conn.createStatement();
    ```
* 6.执行sql
    ```
    int count = stmt.executeUpdate(sql);
    ```
* 7.处理结果
    ```
    System.out.println(count);
    ```
* 8.释放资源
    ```
    stmt.close();
    conn.close();
    ```