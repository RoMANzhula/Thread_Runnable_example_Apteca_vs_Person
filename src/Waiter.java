public interface Waiter { 
    public default void waitAMoment() { 
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
