import java.util.Scanner;

public class SumaArmonica {
    public static void main(String[] args) {
        System.out.println("Enter n from keyboard : \n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        float armonicSum = 0;
        for (int j = 0; j < n; j++){
            ++j;
            if (j == 1){
               armonicSum = armonicSum+1;
            }else {
                armonicSum = armonicSum + (float)1 / j;
            }

        }
        System.out.println("armonicSum: " +armonicSum);
    }
}
