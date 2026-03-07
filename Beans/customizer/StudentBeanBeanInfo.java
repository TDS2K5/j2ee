package customizer;

import java.beans.*;

public class StudentBeanBeanInfo extends SimpleBeanInfo {

    public BeanDescriptor getBeanDescriptor() {

        return new BeanDescriptor(StudentBean.class, StudentBeanCustomizer.class);
    }
}
