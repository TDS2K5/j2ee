import java.beans.*;

public class IntrospectorEx {
    public static void main(String[] args) throws IntrospectionException {
        Introspector.flushCaches();
        BeanInfo info = Introspector.getBeanInfo(StudentIntro.class);

        System.out.println("Properties of StudentIntro:");
        for (PropertyDescriptor pd : info.getPropertyDescriptors())
            System.out.println(pd.getName()+"->"+pd.getDisplayName());

        System.out.println("\nMethods of StudentIntro:");
        for (MethodDescriptor md : info.getMethodDescriptors()) {
            System.out.println(md.getName());
        }
    }
}


