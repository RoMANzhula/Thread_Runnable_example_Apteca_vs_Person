public class Pharmacy implements Runnable, RandomCount, RandomDrug, Waiter { 
    @Override
    public void run() {
        while (!Main.isStopped) {
            Main.drugsController.sell(getRandomDrug(), getRandomCount());
            waitAMoment();
            waitAMoment();
        }
    }
}
