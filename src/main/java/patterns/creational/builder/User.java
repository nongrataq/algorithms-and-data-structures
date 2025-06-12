package patterns.creational.builder;

import java.time.LocalDateTime;

public class User {
    private int age;
    private String name;
    private String surname;
    private String password;
    private LocalDateTime dateOfBirth;
    private String email;

    private User() {}

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private final User user = new User();

        public Builder age(int age) {
            user.age = age;
            return this;
        }

        public Builder name(String name) {
            user.name = name;
            return this;
        }

        public Builder surname(String surname) {
            user.surname = surname;
            return this;
        }

        public Builder password(String password) {
            user.password = password;
            return this;
        }

        public Builder dateOfBirth(LocalDateTime dateOfBirth) {
            user.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder email(String email) {
            user.email = email;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
