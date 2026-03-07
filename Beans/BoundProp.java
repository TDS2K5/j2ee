import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class SimpleBoundBean{
    private String name;
    PropertyChangeSupport support;

    public SimpleBoundBean() {
        support = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        support.firePropertyChange("name", oldName, name);
        System.out.println("Property 'name' changed from " + oldName + " to " + name);
    }
}

public class BoundProp {
    public static void main(String[] args) {
        SimpleBoundBean bean = new SimpleBoundBean();
        bean.addPropertyChangeListener(evt -> {
            System.out.println("Received property change event: " + evt.getPropertyName() +
                               " changed from " + evt.getOldValue() + " to " + evt.getNewValue());
        });

        bean.setName("Alice");
        bean.setName("Bob");
    }
}
