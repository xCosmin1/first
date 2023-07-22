import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu valoarea lui a: ");
        int a = scanner.nextInt() ;

        System.out.println("Introdu valoarea lui b: ");
        int b = scanner.nextInt();

        System.out.println("Introdu valoarea lui c: ");
        int c = scanner.nextInt();

        int delta = calculateDelta(a, b , c);
        System.out.println("Valoarea lui delta este: " +delta);

        int evalDelta = evaluateDelta(delta);
        if (evalDelta == -1)
            return;

        if (evalDelta == 0){
          double x =  calculateXValue(a, b, delta, '0');
            System.out.println("Solutia este unica, cu valoarea: " + x);
            return;
        }

        if(evalDelta == 1) {
            double x1 = calculateXValue(a,b,delta, '-');
            double x2 = calculateXValue(a,b,delta, '+');
            System.out.println("Solutiile sunt: x1= " +x1 + ", x2= " +x2);

        }




    }
    public static int calculateDelta(int a, int b, int c){
        System.out.println("b la patrat: " +(int) Math.pow(b, 2));
      int delta =  (int) Math.pow(b, 2)- 4 * a * c;
        System.out.println("Delta este: " +delta);
        return delta;
    }
    public static double calculateXValue(int a, int b, int delta, char operator){

        double x;
        if(delta < 0){

            return 0;
        }else if(delta == 0){
            x= -b/ (2 * a);

            return x;
        }else {
            if (operator == '+'){
                x = (-b + Math.sqrt(delta))/ (2 * a);
            }else {
                x = (-b - Math.sqrt(delta))/ (2 * a);
            }
            return x;
        }
    }
    public static int  evaluateDelta(int delta){
        if (delta < 0) {
            System.out.println("Delta is negative ");
            return -1;
        }else if (delta == 0) {
            return 0;
        }else {
            return 1;
        }
    }
}
