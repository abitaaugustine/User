package com.example.user;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", "A");
        User user2 = new User("Tom", "T", 10);
        System.out.println(user1.getFirstName());
        System.out.println(user2.getFirstName());
    }
}
