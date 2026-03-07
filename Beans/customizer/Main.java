package customizer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Frame frame = new Frame("Student Bean Customizer");

        StudentBean bean = new StudentBean();
        StudentBeanCustomizer customizer = new StudentBeanCustomizer();

        customizer.setObject(bean);

        frame.add(customizer);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
