package basics;


/*
Javascript example to create the same object:
    person = { name: "Bill Gates", age: 50, isEmployed: true, salary: 10000000 }
*/
public class Person {
    // add three fields name, age, isEmployed, salary
    private String name;
    private int age;
    private boolean isEmployed;
    private float salary;

    public Person(String name){
        this.name = name;
    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name, int age, boolean isEmployed, float salary) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bill Gates");
        System.out.println("person1: " + person1); // System.out.println("person1: " + person1.toString());

        Person person2 = new Person(30);
        System.out.println("person2: " + person2);

        Person person3 = new Person("John Doe", 30, true, 10000.55f);
        System.out.println("person3: " + person3);

        System.out.println("person3 name and age: " + person3.name + " " + person3.age + " years");
    }

}


