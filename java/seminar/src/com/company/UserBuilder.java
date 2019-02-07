package com.company;

import java.net.UnknownServiceException;

public class UserBuilder {
    private int idx;
    private String name;
    private String part;

    public UserBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setPart(String part) {
        this.part = part;
        return this;
    }

    public User build() {
        return new User(this.idx, this.name, this.part);
    }
}
