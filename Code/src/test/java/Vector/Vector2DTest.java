package Vector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class Vector2DTest {
    @Test
    public void addition_isCorrect(){
        Vector2D vector1 = new Vector2D(1,2);
        Vector2D vector2 = new Vector2D(3,4);
        Vector2D vector3 = vector1.addition(vector2);
        assertThat(vector3.x).isEqualTo(4);
        assertThat(vector3.y).isEqualTo(6);
    }
    @Test
    public void scalarProduct_isCorrect(){
        Vector2D vector1 = new Vector2D(1,2);
        Vector2D vector2 = new Vector2D(3,4);
        float scalarProduct = vector1.scalarProduct(vector2);
        assertThat(scalarProduct).isEqualTo(11);
    }
    @Test
    public void magnitude_isCorrect(){
        Vector2D vector1 = new Vector2D(3,4);
        float magnitude = vector1.magnitude();
        assertThat(magnitude).isEqualTo(5);
    }
    @Test
    public void normalization_isCorrect(){
        Vector2D vector1 = new Vector2D(3,4);
        Vector2D vector2 = vector1.normalization();
        assertThat(vector2.x).isEqualTo((float)0.6);
        assertThat(vector2.y).isEqualTo((float)0.8);
    }
}