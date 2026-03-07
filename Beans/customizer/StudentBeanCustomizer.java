package customizer;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class StudentBeanCustomizer extends Panel implements Customizer {

    private StudentBean bean;
    private TextField nameField;
    private TextField ageField;

    public StudentBeanCustomizer() {

        setLayout(new GridLayout(3,2));

        add(new Label("Name:"));
        nameField = new TextField();
        add(nameField);

        add(new Label("Age:"));
        ageField = new TextField();
        add(ageField);

        Button update = new Button("Update");
        add(update);

        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                bean.setName(nameField.getText());
                bean.setAge(Integer.parseInt(ageField.getText()));

                System.out.println("Updated Bean:");
                System.out.println("Name: " + bean.getName());
                System.out.println("Age: " + bean.getAge());
            }
        });
    }

    @Override
    public void setObject(Object bean) {

        this.bean = (StudentBean) bean;

        nameField.setText(this.bean.getName());
        ageField.setText(String.valueOf(this.bean.getAge()));
    }
}