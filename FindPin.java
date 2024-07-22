public class FindPin
{
    public static void main(String[] args) {
        // Example inputs
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38; // You can change this to any value you want to test

        int pin = findPIN(input1, input2, input3, input4);
        System.out.println("The PIN is: " + pin);
    }

    public static int findPIN(int input1, int input2, int input3, int input4) {
        int[] inputs = {input1, input2, input3};
        
        int sumEvenPos = 0;
        int sumOddPos = 0;
        
        for (int input : inputs) {
            String numStr = String.valueOf(input);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                if ((i + 1) % 2 == 0) {
                    sumEvenPos += digit;
                } else {
                    sumOddPos += digit;
                }
            }
        }

        if (input4 % 2 == 0)
         {
            return sumEvenPos - sumOddPos;
        } else 
        {
            return sumOddPos - sumEvenPos;
        }
    }
}