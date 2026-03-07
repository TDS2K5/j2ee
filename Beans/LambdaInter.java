interface InnerLambdaInter {
    void printMessage();
}

abstract class Emp implements InnerLambdaInter{
    void getData(){
        System.out.println("Hi Hello");
    }
}

public class LambdaInter {
    public static void main(String[] args) {
        Emp e=new Emp() {
            public void printMessage(){
                System.out.println("This is individual");
            }
        };
        e.getData();
        Emp e1=new Emp() {
            public void printMessage(){
                System.out.println("This is individual 2");

            }
        };
        e1.getData();
    }
}

class Example implements InnerLambdaInter{
    void getData(){
        System.out.println("hI HELLO");
    }

    @Override
    public void printMessage() {
        System.out.println("Implemented in class");
    } 
}
