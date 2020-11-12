package IsEven;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CommonBitTest {

    @Test
    public void testTest() {
        long x = 25L;
        long y = 14L;
        CommonBit commonbit = new CommonBit();
        int z = commonbit.lowestCommon(x,y);
        assertThat(z).isEqualTo(3);

    }
    @Test
    public void IsEven_returnsFalse_whenOdd() {
        int x = -5;
        boolean odd = IsEven.isEven(x);
        assertThat(odd).isFalse();
    }

}