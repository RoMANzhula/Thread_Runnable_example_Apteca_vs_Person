public interface Waiter { //интерфейс Ожидание
    public default void waitAMoment() { //с помощью ключевого слова default создаем реализованный метод, который будет усыплять потоки на 0,1 секунды
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
