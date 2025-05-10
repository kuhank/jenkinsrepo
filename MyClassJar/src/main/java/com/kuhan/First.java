package com.kuhan;

public class First {
    public static void main(String[] args) {
        System.out.println("maven project in docker !!!");
        System.out.println("Hello - kuhan !!! ");

        // Keep the application running indefinitely (not recommended for production)
        while (true) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                // Handle interruption if needed
            }
        }
    }
}