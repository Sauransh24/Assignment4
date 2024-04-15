package main.java.com.passwordmanager.util;

import java.util.LinkedList;
import java.util.List;

public class HashTable<K, V> {
    private class HashEntry {
        K key;
        V value;

        HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<HashEntry>[] buckets;
    private int capacity;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int hash = getHash(key);
        List<HashEntry> bucket = buckets[hash];
        for (HashEntry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new HashEntry(key, value));
    }

    public V get(K key) {
        int hash = getHash(key);
        List<HashEntry> bucket = buckets[hash];
        for (HashEntry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}

