
import java.util.Scanner;
public class WasteCollectionCalculator {
public static double calculateTotalWaste(double point1Waste, double point2Waste) {
return point1Waste + point2Waste;
}public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
 System.out.print("Enter waste collected at Collection Point 1 (in kg): ");
double point1 = scn.nextDouble();
System.out.print("Enter waste collected at Collection Point 2 (in kg): ");
double point2 = scn.nextDouble();
double totalWaste = calculateTotalWaste(point1, point2);
System.out.println("Total Waste Collected: " + totalWaste + " kg");
scn.close();
}
}