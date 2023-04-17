import java.util.ArrayList;
import java.util.List;

public interface RandomDrug {
    public default Drug getRandomDrug() { //метод, который возвращает случайное лекарство
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size())); //создаем переменную-контейнер, в
        // которой будем хранить случайный(рандомный) индекс  целочисленном виде (это мы обеспечиваем за счет привидения типа к int)
        //при остатке от деления числа(0 до 1000) на размер списка всех лекарств
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet()); //создаем список с типом данных <Drug> в который
        // возвращаем набор всех ключей из карты всех лекарств
        return drugs.get(index); //возвращаем лекарство по рандомному индексу из списка(List) лекарств
    }
}
