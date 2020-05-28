package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.*;



class Person {

    String firstName;
    String lastName;
    int age;
    String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


class Main {


    public static void main(String[] args) {

        ArrayList<Person> persons1 = new ArrayList<>();
        Person p1 = new Person("John", "Brown", 20, "M");
        Person p2 = new Person("Ana", "Clark", 42, "F");
        Person p3 = new Person("Maria", "Luca", 18, "F");
        Person p4 = new Person("Jessie", "Bert", 35, "F");
        Person p5 = new Person("Nick", "Jason", 27, "M");
        Person p6 = new Person("Jason", "Star", 76, "M");
        Person p7 = new Person("Betty", "Smith", 9, "F");
        Person p8 = new Person("Joe", "Martin", 54, "M");
        Person p9 = new Person("Billy", "Argus", 24, "M");
        Person p10 = new Person("Tara", "Lind", 15, "F");
        Person p11 = new Person("Angel", "Kendal", 70, "M");


        persons1.addAll(Arrays.asList(new Person[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11}));
        // List<Person> list;


        System.out.println('\n' + "Persons younger than 25 years old:" + '\n');
        persons1.stream().filter(person -> person.getAge() < 25).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println('\n' + "Males older than 25 years old: " + '\n');
        persons1.stream().filter(person -> person.getAge() > 25 && person.getGender().equals("M")).collect(Collectors.toList()).forEach(System.out::println);


        Comparator<Person> nameComparator = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
        System.out.println('\n' + "Persons ordered by first name:" + '\n');
        persons1.stream().sorted(nameComparator).forEach(System.out::println);


        Comparator<Person> ageComparator = (o1, o2) -> o1.getAge() - o2.getAge();
        System.out.println('\n' + "Persons ordered by age:" + '\n');
        persons1.stream().sorted(ageComparator.reversed()).forEach(System.out::println);

        System.out.println('\n' + "The 3 most youngest persons in the list: " + '\n');
        persons1.stream().sorted(ageComparator).limit(3).forEach(System.out::println);


        OptionalDouble avg = persons1.stream().mapToInt(Person::getAge).average();
        System.out.println('\n' + "Age average: " + avg.getAsDouble());


        System.out.println('\n' + "Uppercase: ");
        persons1.stream().map(person -> person.getFirstName().toUpperCase()).forEach(System.out::println);


    }
}