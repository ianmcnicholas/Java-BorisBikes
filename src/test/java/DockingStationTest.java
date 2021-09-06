import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DockingStationTest {

    @Test
    void testANewDockingStationIsEmpty() {
        DockingStation dockingStation = new DockingStation();
        assertEquals(0, dockingStation.getBikesList().size());
    }

}
