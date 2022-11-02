public class Task3 {
    public static void main(String[] args) {
        int LPStudents = 23;
        int ASStudents = 27;
        int EAStudents = 30;
        int paperTotalSheets = 480;
        int totalStudents = LPStudents + ASStudents + EAStudents;
        int eachStudentPaper = paperTotalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + eachStudentPaper + " листов бумаги");
    }
}
