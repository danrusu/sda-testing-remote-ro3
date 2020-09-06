package basics;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("Bill Gates");
        System.out.println("person1: " + person1); // System.out.println("person1: " + person1.toString());

        Person person2 = new Person(30);
        System.out.println("person2: " + person2);

        Person person3 = new Person("John Doe", 30, true, 10000.55f);
        System.out.println("person3: " + person3);

        System.out.println("person3 name and age: " + person3.getName() + " " + person3.getAge() + " years");
    }
}
