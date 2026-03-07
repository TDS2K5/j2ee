public class gen2<K, V> {
    K key;
    V value;

    gen2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public static void main(String[] args) {
        gen2<Integer, String> pair1 = new gen2<>(1, "One");
        gen2<String, Double> pair2 = new gen2<>("Pi", 3.14);

        System.out.println("Pair 1: Key = " + pair1.getKey() + ", Value = " + pair1.getValue());
        System.out.println("Pair 2: Key = " + pair2.getKey() + ", Value = " + pair2.getValue());
    }
}
