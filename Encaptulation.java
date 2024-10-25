class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// Driver class

public class Main {
    public static void main(String[] args){
        //Object creation

Person person = new Person();

person.setName("John");

person.setAge(30);
        System.out.println("name: " + person.getName();)
        System.out.println("Age: " + person.getAge();)
    }
}