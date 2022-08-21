package com.example.user;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Alice","Tom")
                .withAge(19).
                withAddress("New Delhi").build();
        System.out.println(user.toString());

    }
}
