// 2- WAP to create the class Person having its parameterized constructor, and 2 attributes as name and age.
//  Create the class Student having its attribute as student_id. Class Student inherits class Person.
//  Create a driver class to run the program and provide the user with the given menu. 
// • User can unlimitedly add Student any time; and therefore the existing info gets updated accordingly.
// • Ensure, the code always show the last updated info for choice 2 and 3 
public class Person {
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String toString() {
        return name+", age "+age;
    }
}