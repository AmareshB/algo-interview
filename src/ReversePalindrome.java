public class ReversePalindrome {
    public long[] solution(long num) {
        long newNumber = num;
        long additionCount = 0;
        while (!isPalindrome(newNumber)) {
            if (newNumber >= Integer.MAX_VALUE) {
                System.out.println("No Palindrome possible");
                return null;
            }
            long reverseNum = getReverseDigits(newNumber);
//            System.out.println("num, " + newNumber + " reverse num," + reverseNum);
            newNumber = newNumber + reverseNum;
            additionCount++;
        }


        return new long[]{newNumber, additionCount};
    }

    boolean isPalindrome(long num) {
        return (num == getReverseDigits(num));
    }

    long getReverseDigits(long num) {
        long reverseNum = 0;
        while (num > 0) {
            reverseNum = (reverseNum * 10) + (num % 10);
            num = num / 10;
        }
        return reverseNum;
    }
}
