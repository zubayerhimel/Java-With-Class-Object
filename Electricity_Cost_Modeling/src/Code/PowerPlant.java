package Code;
import java.util.ArrayList;
import java.util.Scanner;

public class PowerPlant {

    private String powerplantName;
    private String powerplantLocation;
    private double powerplantCapacity;
    private double productionCostPerMW;
    private int totalNumberOfConsumer;
    private double pricePerKW;


    private Scanner myscanner;

    // arraylist for consumer and employee to calculate total nummber of consumers and employee
    // for that specific powerplant

    ArrayList <String> consumerlist = new ArrayList<>();
    ArrayList <String> employeelist = new ArrayList<>();

    // constructor
    public PowerPlant()
    {
        myscanner = new Scanner(System.in);
        totalNumberOfConsumer = 0;
    }

    // input method
    public void inputPowerPlantInfo()
    {
        System.out.println("Enter power plant name          : ");
        powerplantName = myscanner.next();
        System.out.println("Enter power plant location      :");
        powerplantLocation = myscanner.next();
        System.out.println("Enter power plant capacity (MW) :");
        powerplantCapacity = myscanner.nextDouble();
        System.out.println("Production cost per MW          :");
        productionCostPerMW = myscanner.nextDouble();
        System.out.println("price per KW                    : ");
        pricePerKW = myscanner.nextDouble();
    }

    // getter methods
    public String getPowerplantName() {
        return powerplantName;
    }

    public String getPowerplantLocation() {
        return powerplantLocation;
    }

    public double getPowerplantCapacity() {
        return powerplantCapacity;
    }

    public double getProductionCostPerMW() {
        return productionCostPerMW;
    }

    public int getTotalNumberOfConsumer() {
        return totalNumberOfConsumer;
    }

    public double getPricePerKW() {
        return pricePerKW;
    }

    // get profit
    private double calculateProfitOfAllPowerplant(double allConsumerBill)
    {
        return (powerplantCapacity * productionCostPerMW) - allConsumerBill;
    }


    public void displayPowerplantInfo(double allconsumerbill)
    {
        System.out.println("Power plant name          : "+powerplantName);
        System.out.println("Power plant location      : "+powerplantLocation);
        System.out.println("Power capacity            : "+powerplantCapacity);
        System.out.println("Total number of consumer  : "+consumerlist.size());
        System.out.println("Production cost per MW    : "+productionCostPerMW);
        System.out.println("Price per KW              : "+pricePerKW);
        System.out.println("Profit of the power plant : "+calculateProfitOfAllPowerplant(allconsumerbill));
    }
}