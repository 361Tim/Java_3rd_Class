package at.tim.basics.crossum;

public class crosssum3 {
    public static void main(String[] args) {
        int[] crossSumCounter = new int[28];

        for (int zahl = 0; zahl < 1000; zahl++) {


            int sum = 0;
            int zahl2 = zahl;
            while (zahl2>0){
                sum += zahl2%10;
                zahl2/=10;

            }
            crossSumCounter[sum] += 1;
        }
        int maxIndex = 0;
        int maxValue = 0;
        for (int i = 0; i < crossSumCounter.length; i++) {
            if (crossSumCounter[i]>maxValue){
                maxValue = crossSumCounter[i];
                maxIndex = i;
            }

        }
        for (int i = 0; i < crossSumCounter.length; i++) {
            if (crossSumCounter[i]==maxValue){
                System.out.println(i + " kommt 75 mal vor" );
            }

        }
    }
}
