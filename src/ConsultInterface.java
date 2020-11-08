public interface ConsultInterface {
    void Paediatrician();
    void Neurologist();

}

class Consultation implements ConsultInterface {

    public void Paediatrician() {
        System.out.println("The Paediatrician is in Room 21, kindly wait till you're asked to go in.");
    }

    public void Neurologist() {
        System.out.println("The Neurologist is in Room 14, kindly wait till you're asked to go in.");
    }


}
