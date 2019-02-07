package com.company;

public class User {

    private int idx;
    private String name;
    private String part;

    public void hello() {
        System.out.println("안녕하세요. 저는 " + part + "파트 " + name + "입니다");
    }

    public User() {
        this.idx = 9;
        this.name = "문광현";
        this.part = "Server";
    }

    public User(int idx, String name, String part) {
        this.idx = idx;
        this.name = name;
        this.part = part;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}

