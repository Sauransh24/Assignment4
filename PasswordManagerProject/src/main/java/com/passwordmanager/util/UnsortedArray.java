package main.java.com.passwordmanager.util;

import java.util.ArrayList;
import java.util.List;

public class UnsortedArray<K, V> {
    private class ArrayEntry {
        K key;
        V value;

        ArrayEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<ArrayEntry> entries;

    public UnsortedArray() {
        entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        for (ArrayEntry entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        entries.add(new ArrayEntry(key, value));
    }

    public V get(K key) {
        for (ArrayEntry entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}
