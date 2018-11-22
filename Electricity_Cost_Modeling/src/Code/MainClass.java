package Code;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        double allConsumerTotalBill = 0;

        PowerPlant powerplant = new PowerPlant();  // powerplant object
        powerplant.inputPowerPlantInfo();


        Employee employee = new Employee();  // employee object
        employee.inputPersonInfo();
        powerplant.employeelist.add(employee.getPersonId());  // to increment employee list in the power plant class


        System.out.println("How many consumer you want to add?");  // consumer array object

        Consumer[] consumer = new Consumer[myscanner.nextInt()];  // no need for extra variable

        for(int i=0; i<consumer.length; i++)
        {
            System.out.println("Customer number "+ i);
            System.out.println("/////////////// INFO //////////////////");
            consumer[i] = new Consumer();
            consumer[i].inputPersonInfo();
            consumer[i].inputConsumerAdditionalInfo();
            powerplant.consumerlist.add(consumer[i].getPersonId());  // to increment consumer list in the power plant class
        }

        // display all consumer info
        for(int j =0; j<consumer.length; j++)
        {
            System.out.println("Customer info "+j);
            System.out.println("////////////// INFO /////////////////");
            consumer[j].displayConsumerInfo(powerplant.getPricePerKW());
            allConsumerTotalBill += consumer[j].getTotalBill();
        }


        // display powerplant info
        powerplant.displayPowerplantInfo(allConsumerTotalBill);

        // display employee info
        employee.updateTotalCollectedBill(allConsumerTotalBill);
        employee.displayEmployeeInfo();
    }
}