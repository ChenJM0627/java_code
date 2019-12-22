package kuangjia;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;

public class kjTest {
    public static void main(String[] args) throws Exception {
        //1.创建配置对象
        Properties pro = new Properties();
        //2.加载配置文件，转换成一个集合，获取class目录下的配置文件
        ClassLoader classLoader = kjTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //3.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //4.加载该类进入内存
        Class cls = Class.forName(className);

        //5.创建对象
        Object obj = cls.newInstance();

        //6.获取方法对象
        Method method = cls.getMethod(methodName);

        //7.执行方法
        method.invoke(obj);

    }
}
