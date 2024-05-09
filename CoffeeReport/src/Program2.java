/*
 * Student Name: Paulo Ricardo Gomes Granjeiro
 */
public class Program2 {

    public static void main(String[] args) {
        double targetWeight = User.inputDouble("Enter the target weight: ");
        double tolerance = User.inputDouble("Enter the tolerance: ");
        Roastery roastery = new Roastery(targetWeight, tolerance);
        roastery.assessCoffeeBoxes();
        roastery.createReport();
        System.out.println("Program by Paulo Ricardo Gomes Granjeiro 041118057 Section 362");
    }

}
