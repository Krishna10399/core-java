package Issue_on_git;
import java.util.Scanner;
public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProducts = 0;
        String[] products = new String[4];
        int[] prices = new int[4];
        double gstPercent = 0;
        //Input Section For Product and Prices
        while (numProducts < 4) {
            System.out.print("Enter Product " + (numProducts + 1) + " - ");
            products[numProducts] = scanner.nextLine();
            System.out.print("Do You Add More [y/n] : ");
            char more = scanner.nextLine() . charAt(0);
            if (more == 'N' || more == 'n')
            {
                break;
            }
            System.out.println("Enter " + products[numProducts] + "Price : -");
            String priceInput = scanner.nextLine();
            //remove any non-numeric character to get the price as an integer
            prices[numProducts] = Integer.parseInt(priceInput.replaceAll("[^0-9]", ""));
            numProducts++;
        }
        //Calculate total price
        int total = 0 ;
        for(int i=0;i<numProducts;i++){
            total += prices[i];
        }
        //Input Section for Gst
        System.out.print("Do You Want to add GST [y/N] :");
        char addGSt = scanner.nextLine().charAt(0);
        if (addGSt == 'Y' || addGSt =='y'){
            System.out.print("Enter GST % :");
            gstPercent = scanner.nextDouble();

        }
        //Calculate Gst Amount
        double gstAmount = (gstPercent / 100) * total;
        //Calculate Final Total
        double finalTotal = total + gstAmount;
        // OutPut Section
        System.out.println("--------- Out Put ----------");
        for (int i = 0; i < numProducts ; i++){
            System.out.println((i + 1) + " . " + products[i] + " = " + prices[i] + " /- ");

        }
        System.out.println("---------------------------------");
        System.out.println("Total = " + total);
        if (addGSt == 'Y' || addGSt == 'y'){
            System.out.println("GST = " + gstPercent + "%");
            System.out.println("-----------------------------");
            System.out.println("Final Total = " + finalTotal + " /- ");

        }
        System.out.println(" ----------------------------------");
        scanner.close();
    }
}