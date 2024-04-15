package main.java.com.passwordmanager.util;

public class LinkedList<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node<K, V> head;

    public void put(K key, V value) {
        for (Node<K, V> x = head; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.value = value;
                return;
            }
        }
        head = new Node<>(key, value, head);
    }

    public V get(K key) {
        for (Node<K, V> x = head; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.value;
            }
        }
        return null;
    }
}
