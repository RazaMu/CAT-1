public class Main {
    public static void main(String[] args) {
        Date dOB = new Date(1945, 1, 7);
        Date dOR = new Date(2023, 6, 29); 

        Customer customer = new Customer("Raila O", dOB, "Bondo", dOR, "Kenya");

        System.out.println(customer);
        System.out.println("Address: Kenya");
        System.out.println("Date of Registration: ", get.dOR);
        System.out.println("Nationality: Kenya" );
    }
}