import java.io.*;
import java.util.ArrayList;

public class Hospital {
    static ArrayList <Patient> patArray  = new ArrayList<>();
    //uses collections to create list of patients
    static String regDate;
    public static void main(String[] args) throws IOException {
        char option;
        Patient pat1 = new Patient(1,"Chioma", "Lagos, Nigeria", 25, 'f', "Tooth ache", 9500, regDate);
        patArray.add(pat1);
        Patient pat2 = new Patient(2,"Hanisa", "Kaduna, Nigeria", 14, 'f', "Catarrh", 2000, regDate);
        patArray.add(pat2);
        do
        {
            Patient p = new Patient();
            //prints out options to implement the interfaces
            System.out.println("Welcome to Crystal Hospital :) \n" +
                    " \n" +
                    " Enter: \n" +
                    " 1 to update your details \n" +
                    " 2 to verify payment \n" +
                    " 3 to get a discount \n" +
                    " 4 to see the Paediatrician \n" +
                    " 5 to see the Neurologist \n" +
                    " 6 to check if drug is available \n" +
                    " 7 to verify Laboratory room number");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //gets the number entered by the patient
            int choice = Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    p.showPatientDetails();
                    p.updatePatientDetails();
                    break;
                case 2:
                    Billing billPay = new Billing();
                    billPay.verifyPayment();
                    break;
                case 3:
                    Billing billDisc = new Billing();
                    billDisc.discount();
                    break;
                case 4:
                    Consultation seePaed = new Consultation();
                    seePaed.Paediatrician();
                    break;
                case 5:
                    Consultation seeNeuro = new Consultation();
                    seeNeuro.Neurologist();
                    break;
                case 6:
                    Inquiry labRmNum = new Inquiry();
                    labRmNum.LabRoomNumber();
                    break;
                case 7:
                    Inquiry drugAvail = new Inquiry();
                    drugAvail.DrugAvailability();
                    break;
                default:
                    System.out.println("No patient with the entered ID");
                    System.out.println("Try again");
                    break;
            }
            System.out.println("Do you want to select another option (y/n):");
            option=(char)br.read();
        } while(option == 'y');

    }
}
