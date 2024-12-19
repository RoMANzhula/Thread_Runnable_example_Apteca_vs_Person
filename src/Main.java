public class Main {
    public static DrugsController drugsController = new DrugsController(); 
    public static boolean isStopped = false; 

    public static void main(String[] args) throws InterruptedException { 
        Thread pharmacy = new Thread(new Pharmacy(), "Pharmacy"); 
        Thread client1 = new Thread(new Client(), "Client #1"); 
        Thread client2 = new Thread(new Client(), "Client #2"); 

        pharmacy.start(); 
        client1.start(); 
        client2.start(); 

        Thread.sleep(1000);
        isStopped = true;

    }
}
