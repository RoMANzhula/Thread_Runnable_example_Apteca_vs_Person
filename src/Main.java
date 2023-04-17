public class Main {
    public static DrugsController drugsController = new DrugsController(); //создаем статическое поле(т.е. поле одно для всех) класса
    //новый обьект типа и поведения класса КонтроллерЛекарств
    public static boolean isStopped = false; //создаем статическое поле(т.е. поле одно для всех)-флаг для регулирования работы
    // потоков

    public static void main(String[] args) throws InterruptedException { //главный метод, который выбрасывает исключение из-за sleep()
        Thread pharmacy = new Thread(new Pharmacy(), "Pharmacy"); //создаем новый поток для обьекта класса Аптека, даем ему имя
        Thread client1 = new Thread(new Client(), "Client #1"); //создаем новый поток для обьекта класса Клиент, даем ему имя
        Thread client2 = new Thread(new Client(), "Client #2"); //создаем новый поток для обьекта класса Клиент, даем ему имя

        pharmacy.start(); //запускаем поток аптека
        client1.start(); //запускаем поток клиент1
        client2.start(); //запускаем поток клиент2

        Thread.sleep(1000); //усыпляем поток на 1 секунду
        isStopped = true; //останавливаем нити с помощью флага, которому мы меняем полярность

    }
}
