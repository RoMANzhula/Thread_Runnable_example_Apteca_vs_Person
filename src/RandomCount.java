public interface RandomCount {
    public default int getRandomCount() {
        return (int) (Math.random() * 5) + 1;
    }
}
