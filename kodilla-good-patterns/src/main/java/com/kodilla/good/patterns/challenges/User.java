package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String email;
    private int phoneNumber;
    private String adress;

    public User(String name, String surname, String email, int phoneNumber, String adress) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", adress='" + adress + '\'' +
                '}';
    }
}
