public class Task7 {
    public static void main(String[] args) {
        double weightLossTotal = 7 * 1000;
        int weightLossEachDayMin = 250;
        int weightLossEachDayMax = 500;
        double timePeriodMax = weightLossTotal / weightLossEachDayMin;
        System.out.println("Если спортсмен будет терять каждый день по 250 г, то на похудение у него уйдет " + timePeriodMax + " дней");
        double timePeriodMin = weightLossTotal / weightLossEachDayMax;
        System.out.println("Если спортсмен будет терять каждый день по 500 г, то на похудение у него уйдет " + timePeriodMin + " дней");
        int weightLossEachDayAverage = (weightLossEachDayMin + weightLossEachDayMax) / 2;
        double timePeriodAverage = weightLossTotal / weightLossEachDayAverage;
        System.out.println("В среднем спортсмен будет терять по " + weightLossEachDayAverage + " г каждый день в течение " + timePeriodAverage + " дней");


    }
}
