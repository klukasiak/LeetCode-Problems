import org.junit.jupiter.api.Test;
import p1_TwoSum.Solution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testFromLeetCode(){
        Solution sol = new Solution();
        int[] expectedOutput = {0, 1};
        int[] exampleInput = {2, 7, 11, 15};
        assertArrayEquals(expectedOutput, sol.twoSum(exampleInput, 9));
    }

    @Test
    void testStickedValues(){
        Solution sol = new Solution();
        int[] expectedOutput = {1, 2};
        int[] exampleInput = {1, 5, 8, 25};
        assertArrayEquals(expectedOutput, sol.twoSum(exampleInput, 13));
    }

    @Test
    void testPeeledValues(){
        Solution sol = new Solution();
        int[] expectedOutput = {0, 3};
        int[] exampleInput = {2, 15, 11, 7};
        assertArrayEquals(expectedOutput, sol.twoSum(exampleInput, 9));
    }
}
