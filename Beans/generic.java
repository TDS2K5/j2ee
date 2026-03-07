public class generic<T> {
    T obj;

    generic(T obj) {
        this.obj = obj;
    }

    public void show() {
        System.out.println("The type of object is: " + obj.getClass().getName());
    }
    
    public T getObject() {
        return obj;
    }
    public static void main(String[] args) {
        generic<Integer> intObj = new generic<>(42);
        generic<String> strObj = new generic<>("Hello, World!");

        intObj.show();
        strObj.show();
        System.out.println("Integer object: " + intObj.getObject());
        System.out.println("String object: " + strObj.getObject());
    }
}
