package reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

public class demoreflect {
    public static void main(String[] args) throws Exception {
    //1.
      Class cls = Class.forName("domain.Person");
      System.out.println(cls);
      //2.
        Class cls1 = Person.class;

        Constructor constructor = cls1.getConstructor() ;
        System.out.println(constructor);

        Person obj = (Person) cls1.getDeclaredConstructor().newInstance();

        Method method = cls1.getMethod("setName",String.class);
        Person p = new Person();
        method.invoke(p,"cjm");
        System.out.println(p.toString());

        Method[] methods = cls1.getMethods();

        for(Method m:methods){
          System.out.println(m);
          m.setAccessible(true);
        }
    }
}
