import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    void testANewBikeIsWorking() {
        Bike bike = new Bike();
        assertEquals(true, bike.getIsWorking());
    }

}
