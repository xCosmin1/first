import java.util.HashMap;

public class NumberOccurenceInArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2};
        HashMap <Integer, Integer> duplicateNumbers = new HashMap<>();

        for( int i = 0; i < numbers.length; i++){
            int numberOfOccurence = 0;
            for(int j = i + 1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    System.out.println(numbers[i] + " is a duplicate number");
                    numberOfOccurence++;
                }
                if(numberOfOccurence > 0){
                    duplicateNumbers.put(numbers[i], numberOfOccurence);
                }
            }
        }

        for (Integer key : duplicateNumbers.keySet()){
            System.out.println(key + " occurs " + duplicateNumbers.get(key) + " times ");
        }

    }
}
