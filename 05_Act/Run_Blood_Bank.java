import java.util.Scanner;

public class Run_Blood_Bank {
    public static void main(String[] args) {
        Scanner bld = new Scanner(System.in);

        Blood_Bank bd = new Blood_Bank(); 
        
        System.out.println("Enter blood type of patient: ");
        String input1 = bld.nextLine();

        System.out.println("Enter the Rhesus factor (+ or -): ");
        String input2 = bld.nextLine();

        if (!input1.isEmpty()) {
            bd.setBloodType(input1);
        }
        if (!input2.isEmpty()) {
            bd.setRhFactor(input2);
        }

        System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");

        bld.close();
    }
}