import java.util.Scanner;
public class run_blood_data {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter blood type of patient: ");
        String input1 = inp.nextLine();
        System.out.println("Enter the Rhesus Factor (+ or -)");
         String input2 = inp.nextLine();

         if(input1 == "" && input2 == "") {

            blood_data sp = new blood_data();
            sp.display();

         }
         else {
            
            blood_data rp = new blood_data(input1, input2);
            rp.display();
         }

         inp.close();
    }
}
