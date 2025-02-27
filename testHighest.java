import static org.junit.Assert.*;
import org.junit.Test;

public class testHighest {

    @Test
    public void testTwoHighest() {
  assertArrayEquals(new int[]{9, 7}, LowestAndSmallest.highetAndLowest(new int[]{1, 4, 5, 6, 9, 7, -10,9}));
        assertArrayEquals(new int[]{10, 8},  LowestAndSmallest.highetAndLowest(new int[]{2, 10, 8, 3, 6}));
        assertArrayEquals(new int[]{100, 50}, LowestAndSmallest.highetAndLowest(new int[]{50, 100, 25}));
        assertArrayEquals(new int[]{5, 3},  LowestAndSmallest.highetAndLowest(new int[]{5, 3}));
        assertArrayEquals(new int[]{-1, -2},  LowestAndSmallest.highetAndLowest(new int[]{-5, -2, -3, -1}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayTooSmall() {
        LowestAndSmallest.highetAndLowest(new int[]{5});
    }
}
