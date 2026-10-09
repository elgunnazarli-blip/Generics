public class Pair <K, V>{
    private K Key;
    private V Value;

    public Pair(K key, V value) {
        Key = key;
        Value = value;
    }

    public V getValue() {
        return Value;
    }

    public void setValue(V value) {
        Value = value;
    }

    public K getKey() {
        return Key;
    }

    public void setKey(K key) {
        Key = key;
    }

    @Override
    public String toString() {
        return Key + " = " + Value;
    }
}
