public class Main {

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = findPin(input1, input2, input3, input4);
        System.out.println(pin);  // Output: 1
    }

    public static int findPin(int input1, int input2, int input3, int input4) {
        int evenSum = 0;
        int oddSum = 0;

        if (input4 % 2 == 0) {
            evenSum = sumDigitsByPosition(input1, true) + sumDigitsByPosition(input2, true) + sumDigitsByPosition(input3, true);
            oddSum = sumDigitsByPosition(input1, false) + sumDigitsByPosition(input2, false) + sumDigitsByPosition(input3, false);
        } else {
            oddSum = sumDigitsByPosition(input1, false) + sumDigitsByPosition(input2, false) + sumDigitsByPosition(input3, false);
            evenSum = sumDigitsByPosition(input1, true) + sumDigitsByPosition(input2, true) + sumDigitsByPosition(input3, true);
        }

        return evenSum - oddSum;
    }

    public static int sumDigitsByPosition(int number, boolean isEven) {
        String numStr = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (isEven && (i + 1) % 2 == 0) {
                sum += digit;
            } else if (!isEven && (i + 1) % 2 != 0) {
                sum=sum+ digit;
            }
        }

        return sum;
    }
}