package org.soap.seminar2.model;

public class User {
    private String name;
    private String part;

    public User(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPart() {
        return part;
    }

    public User setPart(String part) {
        this.part = part;
        return this;
    }


}
