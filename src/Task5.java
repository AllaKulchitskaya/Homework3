public class Task5 {
    public static void main(String[] args) {
        int paintTotalTins = 120;
        int eachClassWhitePaint = 2;
        int eachClassBrownPaint = 4;
        int classesNumber = paintTotalTins / (eachClassWhitePaint + eachClassBrownPaint);
        int whitePaintTotalTins = eachClassWhitePaint * classesNumber;
        int brownPaintTotalTins = eachClassBrownPaint * classesNumber;
        System.out.println("В школе, где " + classesNumber + " классов, нужно " + whitePaintTotalTins + " банок белой краски и " + brownPaintTotalTins + " банок коричневой краски");
    }
}
