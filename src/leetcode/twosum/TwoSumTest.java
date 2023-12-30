package leetcode.twosum;

import leetcode.addtwonumbers.AddTwoNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertArrayEquals(TwoSum.twoSum(new int[]{2,7,1,2,3}, 9),new int[]{0,1});
    }
}