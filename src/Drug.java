public class Drug { //создали публичный класс Лекарство
    private String name; //поле класса - название лекарства
    private String description; //поле класса - описание лекарства

    //Геттеры и Сеттеры для наших полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
