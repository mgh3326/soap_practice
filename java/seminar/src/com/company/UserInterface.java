package com.company;

public interface UserInterface {

    public static final String DEPT = "소프트웨어공학과";
    int DEPNO = 320;

    public abstract void getInfo();

    String getDept();

    public default void setState(final boolean state) {
        if (state) {
            System.out.println("휴학중");
        } else {
            System.out.println("재학중");

        }
    }

    public static void world() {
        System.out.println("World!");
    }
}
