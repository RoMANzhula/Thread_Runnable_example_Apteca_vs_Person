public interface RandomCount { //интерфейс СлучайноеЧисло
    public default int getRandomCount() { //метод для возврата случайного(рандомного) числа для покупки клиентом лекарства
        return (int) (Math.random() * 5) + 1; //возвращаем число от 1 до 5
    }
}
