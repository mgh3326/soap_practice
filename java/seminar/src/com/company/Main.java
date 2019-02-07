package com.company;

public class Main {

    public static void main(String[] args) {
        final User user1 = new User();
        final User user2 = new User(2, "류지훈", "기획");

        // write your code here
        user1.hello();
        user2.hello();
        final UserBuilder userBuilder = new UserBuilder();
        final User user3 = userBuilder
                .setIdx(3)
                .setName("남윤환").setPart("Android").build();
        user3.hello();
    }
}
