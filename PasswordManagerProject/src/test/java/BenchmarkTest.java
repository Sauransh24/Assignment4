package test.java;

import main.java.com.passwordmanager.core.PasswordManager;
import java.io.FileWriter;
import java.io.IOException;

public class BenchmarkTest {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager();

        try (FileWriter writer = new FileWriter("benchmark_results.csv")) {
            writer.write("DataStructure,Operation,Time(ns)\n");
            
            long startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.hashtablestore("user" + i, "Password" + i);
            }
            long endTime = System.nanoTime();
            writer.write("HashTable,Store," + (endTime - startTime) + "\n");

            startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.hashtableverify("user" + i, "Password" + i);
            }
            endTime = System.nanoTime();
            writer.write("HashTable,Verify," + (endTime - startTime) + "\n");

            
            startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.UnsortedArraystore("user" + i, "Password" + i);
            }
            endTime = System.nanoTime();
            writer.write("UnsortedArray,Store," + (endTime - startTime) + "\n");

            startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.UnsortedArrayverify("user" + i, "Password" + i);
            }
            endTime = System.nanoTime();
            writer.write("UnsortedArray,Verify," + (endTime - startTime) + "\n");

            startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.LinkedListstore("user" + i, "Password" + i);
            }
            endTime = System.nanoTime();
            writer.write("LinkedList,Store," + (endTime - startTime) + "\n");

            startTime = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                manager.LinkedListverify("user" + i, "Password" + i);
            }
            endTime = System.nanoTime();
            writer.write("LinkedList,Verify," + (endTime - startTime) + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
