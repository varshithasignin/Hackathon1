// 3b-If-else condition

import java.util.Scanner;
public class WasteCollectionStatus {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

System.out.print("Enter waste collected in kg: ");
double wasteCollected = scn.nextDouble();
    if (wasteCollected >= 100) {
     System.out.println("Collection Target Achieved");
    } else {
     System.out.println("More Waste Collection Required");
    }
     scn.close();
    }
}