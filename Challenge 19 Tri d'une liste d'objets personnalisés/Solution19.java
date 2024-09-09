import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class representing a person with a name and an age
class Person {
    private String name;
    private int age;

    // Constructor to initialize a person with a name and an age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get the name of the person
    public String getName() {
        return name;
    }

    // Method to get the age of the person
    public int getAge() {
        return age;
    }

    // toString method to get a textual representation of the Person object
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Main class to test sorting of custom objects
public class Solution19 {
    public static void main(String[] args) {
        
        
        // Creating a list of persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 20));

        // Displaying the list before sorting
        System.out.println("List before sorting:");
        for (Person person : persons) {
            System.out.println(person);
        }

        // Sorting the list of persons based on age using a comparator
        Collections.sort(persons, Comparator.comparingInt(Person::getAge));

        // Displaying the list after sorting by age
        System.out.println("\nList after sorting by age:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
