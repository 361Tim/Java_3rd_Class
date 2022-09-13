package at.tim.basics.crossum;

public class quersumme3 {
    public static void main(String[] args) {
        int[] crossSumCounter = new int[28];

        for (int cnt = 0; cnt < 1000; cnt++) {
            String numberAsString = Integer.toString(cnt);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);

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
