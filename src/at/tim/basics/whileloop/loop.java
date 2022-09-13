package at.tim.basics.whileloop;

import java.util.Random;

public class loop {
    public static void main(String[] args) {
        int min = 10;
        int max = 30;

        Random random = new Random();

        boolean isFinished = false;

        while (!isFinished){
            int i = random.nextInt(30 );
            System.out.println("Nr:" + i);



            if ((i==15)||(i==25)){
                isFinished=true;


            }

        }

    }

}
