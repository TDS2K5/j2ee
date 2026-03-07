import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

class MyBean implements Serializable {
    private String name;
    private int age;

    public MyBean() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class SimpleBean {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo myBeanInfo = Introspector.getBeanInfo(MyBean.class);
        System.out.println("Properties of MyBean:");
        for (PropertyDescriptor pd : myBeanInfo.getPropertyDescriptors())
            System.out.println(pd.getName());

        System.out.println("\nMethods of MyBean:");
        for (MethodDescriptor md : myBeanInfo.getMethodDescriptors()) 
            System.out.println(md.getName());
    }
}
