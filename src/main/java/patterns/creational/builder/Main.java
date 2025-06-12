package patterns.creational.builder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(10).dateOfBirth(LocalDateTime.now()).
        email("mail.ru").build();
        System.out.println(user);
    }
}
