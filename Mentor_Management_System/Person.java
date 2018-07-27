package Mentor_Management_System;
import java.util.Scanner;
public class Person {

    private String PersonID;
    private String PersonName;
    private String PersonContactNumber;

    Scanner myscanner;

    public Person() {
        myscanner = new Scanner(System.in);
    }

    public void inputAll() {
        System.out.println("Person ID         : ");
        PersonID = myscanner.next();
        System.out.println("Person Name       : ");
        PersonName = myscanner.next();
        System.out.println("Person Contact    : ");
        PersonContactNumber = myscanner.next();
    }

    public String getId() {
        return PersonID;
    }

    public String getName() {
        return PersonName;
    }

    public String getContactNumber() {
        return PersonContactNumber;
    }
}