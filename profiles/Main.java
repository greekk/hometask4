package com.greekk.hometask4.profiles;

public class Main {
    public static void main(String[] args) {
        Profile firstProfile = new Profile();
        firstProfile.firstName = "Alex";
        firstProfile.lastName = "Grich";
        firstProfile.age = 40;
        firstProfile.user = new User();
        firstProfile.user.login = "greekk";
        firstProfile.user.password = "asd#$5";
        firstProfile.user.role = "user";

        Profile secondProfile = new Profile();
        secondProfile.firstName = "Sveta";
        secondProfile.lastName = "Kon";
        secondProfile.age = 42;
        secondProfile.user = new User();
        secondProfile.user.login = "sevtlanka";
        secondProfile.user.password = "234fds";
        secondProfile.user.role = "admin";
    }
}
