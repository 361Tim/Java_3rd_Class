package at.tim.basics.ifbedingung;



import java.util.Random;


public class bediengung {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
    
        if (randomNumber>50){
            System.out.println("big");
        } else if (randomNumber<10) {
            System.out.println("mini");
        }else if ((randomNumber>10) && (randomNumber<50)){
            System.out.println("medium");
        }

        }
    }