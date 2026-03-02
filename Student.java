// 2- WAP to create the class Person having its parameterized constructor, and 2 attributes as name and age.
//  Create the class Student having its attribute as student_id. Class Student inherits class Person.
//  Create a driver class to run the program and provide the user with the given menu. 
// • User can unlimitedly add Student any time; and therefore the existing info gets updated accordingly.
// • Ensure, the code always show the last updated info for choice 2 and 3 
public class Student extends Person{
    private int studentId;
    public int getstudentId() {
        return studentId;
    }
    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }
    public Student(String name,int age,int studentId){
        super(name,age);
        this.studentId=studentId;
    }
    public String toString() {
        return super.toString()+" (student id: "+studentId+")";
    }
}