package Application;


import java.time.LocalDate;

public class Person {

        public enum Sex {
            MALE, FEMALE
        }

        String name;
        LocalDate birthday;
        Sex gender;
        String emailAddress;
        int age;

        public int getAge() {
           return this.age;

            // ...
        }

        public void printPerson() {
            // ...
        }




}
