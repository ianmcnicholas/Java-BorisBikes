import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DockingStationTest {

    private DockingStation dockingStation;

    @BeforeEach
    public void setUp() {
        dockingStation = new DockingStation();
    }

    @Test
    @DisplayName("A new docking station should be empty to start with")
    void testANewDockingStationIsEmpty() {
        assertEquals(0, dockingStation.getBikesList().size());
    }

    @Test
    @DisplayName("A docking station can 'dock' a bike")
    void testCanDockABike() {

    }

}
