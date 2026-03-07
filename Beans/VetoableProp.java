import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

class VetoableBean {
    private String name;
    VetoableChangeSupport support;

    public VetoableBean() {
        support = new VetoableChangeSupport(this);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        support.removeVetoableChangeListener(listener);
    }

    public String getName() { return name; }

    public void setName(String name) throws PropertyVetoException {
        String oldName = this.name;
        support.fireVetoableChange("name", oldName, name);
        this.name = name;
        System.out.println("Property 'name' changed from " + oldName + " to " + name);
        this.name = name;
    }
}

public class VetoableProp {
    public static void main(String[] args) throws IntrospectionException, PropertyVetoException {
        VetoableBean bean = new VetoableBean();
        bean.addVetoableChangeListener(evt -> {
            if (evt.getNewValue()=="Bob") {
                throw new PropertyVetoException("Name 'Bob' is not allowed", evt);
            }
        });

        BeanInfo info= Introspector.getBeanInfo(VetoableBean.class);
        System.out.println("Event sets of VetoableBean:");
        for (PropertyDescriptor esd : info.getPropertyDescriptors())
            System.out.println(esd.getName() + " is constrained: " + esd.isConstrained());

        bean.setName("Alice");
        bean.setName("Bob"); 

        
    }
}
