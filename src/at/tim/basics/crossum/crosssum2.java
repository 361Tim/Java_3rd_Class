package at.tim.basics.crossum;

public class crosssum2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            int num = i;
            int crossnum = 0;
            while (num>0){
                crossnum += num%10;
                num /= 10;

            }
            if (crossnum%7==0)
                System.out.println("Zahl " + i + " summe " + crossnum);
        }
    }
}

