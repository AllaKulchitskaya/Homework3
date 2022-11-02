public class Task4 {
    public static void main(String[] args) {
        int timePeriod1 = 2;
        int outputTimePeriod1 = 16;
        int outputOneMinute = outputTimePeriod1 / timePeriod1;
        int timePeriod2 = 20;
        int outputTimePeriod2 = outputOneMinute * timePeriod2;
        System.out.println("За 20 минут машина произвела " + outputTimePeriod2 + " штук бутылок");
        int timePeriod3 = 60 * 24;
        int outputTimePeriod3 = outputOneMinute * timePeriod3;
        System.out.println("За сутки машина произвела " + outputTimePeriod3 + " штук бутылок");
        int timePeriod4 = timePeriod3 * 3;
        int outputTimePeriod4 = outputOneMinute * timePeriod4;
        System.out.println("За 3 дня машина произвела " + outputTimePeriod4 + " штук бутылок");
        int timePeriod5 = timePeriod3 * 30;
        int outputTimePeriod5 = outputOneMinute * timePeriod5;
        System.out.println("За месяц машина произвела " + outputTimePeriod5 + " штук бутылок");

    }
}
