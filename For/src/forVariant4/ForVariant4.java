package forVariant4;

import java.util.Scanner;

/**
 * A real number is given - the price of 1 kg of sweets.
 * Display the cost of 1, 2,…, 10 kg of sweets.
 */
public class ForVariant4 {
    public static void main(String[] args){
        // entering prise
        System.out.println("enter prise 1 kg");
        float prise = getPositiveFloat();

        float[] prises = getPrises(prise);
        showPrices(prises);
    }

    /**
     *
     * @return positive float number
     */
    public static float getPositiveFloat(){
        Scanner scanner = new Scanner(System.in);
        float number = 0f;

        while (number <= 0f){
            System.out.println("enter number:");

            if(scanner.hasNextFloat()){
                number = scanner.nextFloat();
            }
            else{
                scanner.next();
            }
        }

        return number;
    }

    /**
     *  show prices for 1,2..,10 kg in console
     * @param prises per kilogram
     */
    public static void showPrices(float[] prises){
        for(int i = 0;i < 10; i++){
            System.out.println((i + 1) + " kg = " + prises[i]);
        }
    }
    /**
     *
     * @param prise per kilogram
     * @return array for prices for 1,2..,10 kg
     */
    public static float[] getPrises(float prise){
        float[] prises = new float[10];

        for (int i = 0;i < 10;i++){
            prises[i] = prise * (i + 1);
        }

        return prises;
    }
}
