import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Hospital {
    static ArrayList <Patient> patArray  = new ArrayList<>();
    static String regDate;
    public static void main(String[] args) throws IOException {
        char option;
        Calendar.getInstance();
        new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
        Patient pat1 = new Patient(1,"Chioma", "Lagos, Nigeria", 25, 'f', "Tooth ache", 9500, regDate);
        patArray.add(pat1);
        Patient pat2 = new Patient(2,"Hanisa", "Kaduna, Nigeria", 14, 'f', "Catarrh", 2000, regDate);
        patArray.add(pat2);
        do
        {
            Patient p = new Patient();
            System.out.println("Enter: \n 1 to update your details \n 2 to verify payment \n 3 to get a discount");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                    Collections.sort(patArray);
                    Billing billDisc = new Billing();
                    billDisc.discount();
                    break;
                default:
                    System.out.println("Patient does not exist with the entered ID");
                    System.out.println("Try again");
                    break;
            }
            System.out.println("Do you want to select another option (Y/N):");
            option=(char)br.read();
        }while(option == 'Y');


    }
}
// class Patient
class Patient implements Comparable<Patient>
{
    int patientID;
    String patientName;
    String patientAddress;

    int age;
    char patientSex;
    String patientIllness;
    float appointmentFee;
    String regDate;

    Patient() {}
    public int compareTo(Patient p)
    {
        return this.patientID = p.patientID;
    }

    Patient(int patientID,String patientName,String patientAddress,int age,char patientSex,String patientIllness,float appointmentFee, String regDate)
    {
        this.patientID=patientID;
        this.patientName=patientName;
        this.patientAddress=patientAddress;
        this.age=age;
        this.patientSex=patientSex;
        this.patientIllness=patientIllness;
        this.appointmentFee=appointmentFee;
        this.regDate = regDate;
    }

    @SuppressWarnings ("no access")

    // to update a patient's details
    void updatePatientDetails() throws IOException
    {
        char l;
        Patient p2 = new Patient(patientID, patientName, patientAddress, age, patientSex, patientIllness, appointmentFee, regDate);
        do{
            System.out.println("Enter patient ID you want to update:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int idNum = Integer.parseInt(br.readLine());
            for(int i = 0; i< Hospital.patArray.size(); i++)
            {
                if(idNum == Hospital.patArray.get(i).patientID)
                {
                    System.out.println("Enter 1 to change patient's name \n 2 to change patient's address \n 3 to change patient's age \n 4 to change patient's illness \n 5 to change registration fees along with the medical expenses");
                    int ch = Integer.parseInt(br.readLine());
                    switch(ch)
                    {
                        case 1:
                            System.out.println("Enter new patient's name:");
                            p2.patientName = br.readLine();
                            p2.patientID= Hospital.patArray.get(i).patientID;
                            p2.patientAddress= Hospital.patArray.get(i).patientAddress;
                            p2.age= Hospital.patArray.get(i).age;
                            p2.patientSex= Hospital.patArray.get(i).patientSex;
                            p2.patientIllness = Hospital.patArray.get(i).patientIllness;
                            p2.appointmentFee = Hospital.patArray.get(i).appointmentFee;
                            p2.regDate = Hospital.patArray.get(i).regDate;
                            Hospital.patArray.set(i,p2);
                            System.out.println("Patient updated");
                            break;
                        case 2:
                            System.out.println("Enter new address:");
                            p2.patientAddress = br.readLine();
                            p2.patientID = Hospital.patArray.get(i).patientID;
                            p2.patientName = Hospital.patArray.get(i).patientName;
                            p2.age = Hospital.patArray.get(i).age;
                            p2.patientSex = Hospital.patArray.get(i).patientSex;
                            p2.patientIllness = Hospital.patArray.get(i).patientIllness;
                            p2.appointmentFee = Hospital.patArray.get(i).appointmentFee;
                            p2.regDate = Hospital.patArray.get(i).regDate;
                            Hospital.patArray.set(i,p2);
                            System.out.println("Patient updated");
                            break;
                        case 3:
                            System.out.println("Enter new Patient age:");
                            p2.age = Integer.parseInt(br.readLine());
                            p2.patientID = Hospital.patArray.get(i).patientID;
                            p2.patientName = Hospital.patArray.get(i).patientName;
                            p2.patientAddress = Hospital.patArray.get(i).patientAddress;
                            p2.patientSex = Hospital.patArray.get(i).patientSex;
                            p2.patientIllness = Hospital.patArray.get(i).patientIllness;
                            p2.appointmentFee = Hospital.patArray.get(i).appointmentFee;
                            p2.regDate= Hospital.patArray.get(i).regDate;
                            Hospital.patArray.set(i,p2);
                            System.out.println("Patient updated !!!");
                            break;
                        case 4:
                            System.out.println("Enter new Patient illness:");
                            p2.age = Hospital.patArray.get(i).age;
                            p2.patientID= Hospital.patArray.get(i).patientID;
                            p2.patientName = Hospital.patArray.get(i).patientName;
                            p2.patientAddress = Hospital.patArray.get(i).patientAddress;
                            p2.patientSex = Hospital.patArray.get(i).patientSex;
                            p2.patientIllness = br.readLine();
                            p2.appointmentFee = Hospital.patArray.get(i).appointmentFee;
                            p2.regDate = Hospital.patArray.get(i).regDate;
                            Hospital.patArray.set(i,p2);
                            System.out.println("Patient updated !!!");
                            break;
                        case 5:
                            System.out.println("Enter the new amount that patient needs to pay:");
                            p2.age = Hospital.patArray.get(i).age;
                            p2.patientID = Hospital.patArray.get(i).patientID;
                            p2.patientName = Hospital.patArray.get(i).patientName;
                            p2.patientAddress = Hospital.patArray.get(i).patientAddress;
                            p2.patientSex = Hospital.patArray.get(i).patientSex;
                            p2.patientIllness = Hospital.patArray.get(i).patientIllness;
                            p2.appointmentFee = Float.parseFloat(br.readLine());
                            p2.regDate = Hospital.patArray.get(i).regDate;
                            Hospital.patArray.set(i,p2);
                            System.out.println("Patient details updated !!!");
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                }
            }
            System.out.println("Do you want to continue updating (y/n):");
            l=(char)br.read();
        }while(l=='y');
    }

    void showPatientDetails()
    {
        System.out.println("patient-ID \t Patient-Name \t Address \t\t Age \t Sex \t Illness \t Fees \t Join-date");
        for(int i = 0; i< Hospital.patArray.size(); i++)
        {
            System.out.println(Hospital.patArray.get(i).patientID + " \t\t "+
                    Hospital.patArray.get(i).patientName+" \t\t "+ Hospital.patArray.get(i).patientAddress+
                    " \t "+ Hospital.patArray.get(i).age+" \t "+ Hospital.patArray.get(i).patientSex+" \t "
                    + Hospital.patArray.get(i).patientIllness+" \t\t "+ Hospital.patArray.get(i).appointmentFee+" \t "+ Hospital.patArray.get(i).regDate);
        }
    }
}