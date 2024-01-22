package com.manolov.architecture;

public record User(String name, String lastName, Region region, String email) {

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", region=" + region +
                ", email='" + email + '\'' +
                '}';
    }
}
