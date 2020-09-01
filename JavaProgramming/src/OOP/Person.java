package OOP;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void sayHi() {
        System.out.println("Hi There! I'm " + this.name + " and i am " + this.age + " years old.");
    }

    public void growOlder() {this.age= this.age + 1;}

}
