public class Person {
    public String name;
    public String position;
    public String email;
    public String numberPhone;
    public int salary;
    public int age;


    public Person(String name, String position, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println(name + ": " + position + ", " + email + ", " + numberPhone + ", " + salary + ", " + age);
    }
}
