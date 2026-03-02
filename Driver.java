// 2- WAP to create the class Person having its parameterized constructor, and 2 attributes as name and age.
//  Create the class Student having its attribute as student_id. Class Student inherits class Person.
//  Create a driver class to run the program and provide the user with the given menu. 
// • User can unlimitedly add Student any time; and therefore the existing info gets updated accordingly.
// • Ensure, the code always show the last updated info for choice 2 and 3 

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        boolean running=true;
        while(running){
            System.out.print("Please select an option\n1. Create and add student\n2. View all students\n3.View youngest student\n4. quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    input.nextLine();
                    System.out.print("Please enter the students name\n> ");
                    String name=input.nextLine();
                    System.out.print("Please enter the students age\n> ");
                    int age=input.nextInt();
                    System.out.print("Please enter the students studentId\n> ");
                    students.add(new Student(name,age,input.nextInt()));
                    System.out.println("Student created: "+students.getLast());
                    break;
                case 2:
                    if(students.isEmpty()){
                        System.out.println("No records to show...");
                        break;
                    }
                    System.out.println("All students info:");
                    for(Student student:students){
                        System.out.println(student);
                    }
                    break;
                case 3:
                    if(students.isEmpty()){
                        System.out.println("No records to show...");
                        break;
                    }
                    Student youngest=null;
                    for(Student student:students){
                        if(student.getAge()<youngest.getAge())youngest=student;
                    }
                    System.out.println("Youngest student: "+youngest);
                    break;
                case 4:
                    running=false;
                    input.close();
                    System.out.println("Goodbye... :)");
                    break;
                default:
                    System.out.println("Please enter a valid option...");
                    break;
            }
        }
    }
}