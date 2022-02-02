import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class ReversePalindromeTest {

    ReversePalindrome reversePalindrome = new ReversePalindrome();



    @DisplayName("Single test successful")
    @Test
    public void testSingleSuccessTest() {
        System.out.println("Success");
    }


    @DisplayName("Test reverse add WithPossibleAnswer")
    @Test
    void solutionWithPossibleAnswer() {
        long[] expected = {9339, 4};
        assert (Arrays.equals(reversePalindrome.solution(195), expected));
    }

    @DisplayName("Test reverse add With no PossibleAnswer")
    @Test
    void solutionWithNoPossibleAnswer() {
        assert (Arrays.equals(reversePalindrome.solution(196), null));
    }

    @Test
    void isPalindrome() {
    }

    @Test
    void getReverseDigits() {
    }
}