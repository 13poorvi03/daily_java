package Practisecodes.oops;

public class student {
    int rollno = 45;
    String studentname = "Ayush";
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.rollno);
        System.out.println(s1.studentname);

        student s2 = new student();
        s2.rollno =34;
        s2.studentname = "Khushi";

        System.out.println(s2.rollno);
        System.out.println(s2.studentname);
    }
}

// new -- the operator is used to allocate memory 

// oops refers to using objects in programming 
// a class is a user defined blueprint from which objects are created
// object is an instance of a class

// creating an object from a class is known as ---- Instantiating 