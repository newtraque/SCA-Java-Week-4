import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Patient extends Hospital implements Comparable<Patient>
        //compares with ArrayList of patients in Class Hospital
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
                            System.out.println("Patient updated!");
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
    //prints patient details after getting input
    {
        System.out.println("patient-ID \t Patient-Name \t Address \t\t Age \t Sex \tIllness \tFees");
        for(int i = 0; i< Hospital.patArray.size(); i++)
        {
            System.out.println(Hospital.patArray.get(i).patientID + " \t\t "+
                    Hospital.patArray.get(i).patientName+" \t\t "+ Hospital.patArray.get(i).patientAddress+
                    " \t "+ Hospital.patArray.get(i).age+" \t "+ Hospital.patArray.get(i).patientSex+" \t "
                    + Hospital.patArray.get(i).patientIllness+" \t\t "+ Hospital.patArray.get(i).appointmentFee+" \t ");
        }
    }
}