public interface InquiryInterface {
    void LabRoomNumber();
    void DrugAvailability();

}

class Inquiry implements InquiryInterface {

    public void LabRoomNumber() {
        System.out.println("The Laboratory is Room 28.");
    }

    public void DrugAvailability() {
        System.out.println("Kindly scan the barcode of the drug to confirm.");
    }

    }
