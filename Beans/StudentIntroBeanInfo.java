import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class StudentIntroBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor nameProp =
                new PropertyDescriptor("name", StudentIntro.class);

            PropertyDescriptor ageProp =
                new PropertyDescriptor("age", StudentIntro.class);


            nameProp.setDisplayName("Student Name");
            ageProp.setDisplayName("Student Age");

            nameProp.setShortDescription("The name of the student");
            ageProp.setShortDescription("The age of the student");

            return new PropertyDescriptor[]{ nameProp, ageProp };

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
