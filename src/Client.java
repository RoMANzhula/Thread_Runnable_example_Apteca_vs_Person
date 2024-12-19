public class Client implements Runnable, RandomCount, RandomDrug, Waiter { 
    @Override
    public void run() { 
        while (!Main.isStopped) {
            Main.drugsController.buy(getRandomDrug(), getRandomCount());
            waitAMoment();
        }
    }
}
