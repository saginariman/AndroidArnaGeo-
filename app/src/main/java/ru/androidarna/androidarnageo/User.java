package ru.androidarna.androidarnageo;

public class User {
    private String email, name, pass, phone;

    public  User(){};

    public User(String name, String email, String pass, String phone){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getPhone() {
        return phone;
    }
}
