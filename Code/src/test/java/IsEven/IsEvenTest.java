package IsEven;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IsEvenTest {

    @Test
    public void IsEven_returnsTrue_whenEven() {
        int x = -4;
        boolean even = IsEven.isEven(x);
        assertThat(even).isTrue();

    }
    @Test
    public void IsEven_returnsFalse_whenOdd() {
        int x = -5;
        boolean odd = IsEven.isEven(x);
        assertThat(odd).isFalse();
    }

}