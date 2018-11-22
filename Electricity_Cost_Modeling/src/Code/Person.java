package Code;
import java.util.Scanner;

public class Person {

    private String personId;
    private String personName;
    private String personPowerplantName;

    public Scanner myscanner;

    public Person()
    {
        myscanner = new Scanner(System.in);
    }


    public void inputPersonInfo()
    {
        System.out.println("Enter person id        :");
        personId = myscanner.next();
        System.out.println("Enter person name      : ");
        personName = myscanner.next();
        System.out.println("Enter power plant name : ");
        personPowerplantName = myscanner.next();
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonPowerplantName() {
        return personPowerplantName;
    }
}