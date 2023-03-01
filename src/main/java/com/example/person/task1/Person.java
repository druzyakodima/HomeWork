package com.example.person.task1;

import lombok.Getter;
import lombok.Setter;


// TASK 1
@Getter
@Setter
public class Person  {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private String gender;
    private int age;

    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        country = builder.country;
        address = builder.address;
        phone = builder.phone;
        gender = builder.gender;
        age = builder.age;
    }

    public static Builder newBuilder(Person copy) {
        Builder builder = new Builder();
        builder.firstName = copy.getFirstName();
        builder.lastName = copy.getLastName();
        builder.middleName = copy.getMiddleName();
        builder.country = copy.getCountry();
        builder.address = copy.getAddress();
        builder.phone = copy.getPhone();
        builder.gender = copy.getGender();
        builder.age = copy.getAge();
        return builder;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private String gender;
        private int age;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public Builder withMiddleName(String val) {
            middleName = val;
            return this;
        }

        public Builder withCountry(String val) {
            country = val;
            return this;
        }

        public Builder withAddress(String val) {
            address = val;
            return this;
        }

        public Builder withPhone(String val) {
            phone = val;
            return this;
        }

        public Builder withGender(String val) {
            gender = val;
            return this;
        }

        public Builder withAge(int val) {
            age = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
