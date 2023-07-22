import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int height = 175;
        float weight = 62.5f;
        float bmi = weight / (height * height) * 10000;
        System.out.println("Your BMI is " + bmi);

        Scanner Scanner = new Scanner(System.in);
        int heightScan = Scanner.nextInt();
        float weightScan = Scanner.nextFloat();
        int heightSquared = (int) Math.pow(heightScan, 2);
        System.out.println("heightSquared is " + heightSquared);
        float calculateBmi = weightScan / heightSquared * 10000;
        System.out.println("Your BMI is " + calculateBmi);
        interpretBMI(calculateBmi);
    }
     public static void interpretBMI(float bmi){

         if (bmi >= 18.5 && bmi <= 24.9) {
             System.out.println("Your weight is normal so bmi is good");
         } else {
             System.out.println("Your bmi is non optimal");
         }



    }
}
