public class Task8 {
    public static void main(String[] args) {
        int MishaSalaryPerMonth = 67760;
        int DenisSalaryPerMonth = 83690;
        int KristinaSalaryPerMonth = 76230;
        int MishaSalaryPerYear = MishaSalaryPerMonth * 12;
        int DenisSalaryPerYear = DenisSalaryPerMonth * 12;
        int KristinaSalaryPerYear = KristinaSalaryPerMonth * 12;
        double salaryRaise = 10.0 / 100.0;
        double MishaNewSalaryPerMonth = MishaSalaryPerMonth * salaryRaise + MishaSalaryPerMonth;
        double DenisNewSalaryPerMonth = DenisSalaryPerMonth * salaryRaise + DenisSalaryPerMonth;
        double KristinaNewSalaryPerMonth = KristinaSalaryPerMonth * salaryRaise + KristinaSalaryPerMonth;
        double MishaNewSalaryPerYear = MishaNewSalaryPerMonth * 12;
        double DenisNewSalaryPerYear = DenisNewSalaryPerMonth * 12;
        double KristinaNewSalaryPerYear = KristinaNewSalaryPerMonth * 12;
        double MishaSalaryPerYearDifference = MishaNewSalaryPerYear - MishaSalaryPerYear;
        double DenisSalaryPerYearDifference = DenisNewSalaryPerYear - DenisSalaryPerYear;
        double KristinaSalaryPerYearDifference = KristinaNewSalaryPerYear - KristinaSalaryPerYear;
        System.out.println("Миша теперь получает " + MishaNewSalaryPerMonth + " рублей в месяц. Годовой доход вырос на " + MishaSalaryPerYearDifference + " рублей");
        System.out.println("Денис теперь получает " + DenisNewSalaryPerMonth + " рублей в месяц. Годовой доход вырос на " + DenisSalaryPerYearDifference + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNewSalaryPerMonth + " рублей в месяц. Годовой доход вырос на " + KristinaSalaryPerYearDifference + " рублей");

    }
}
