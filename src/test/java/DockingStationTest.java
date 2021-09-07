import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class DockingStationTest {

    @Mock
    Bike mockBike = mock(Bike.class);

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
        dockingStation.dock(mockBike);
        assertEquals(1, dockingStation.getBikesList().size());
    }

}
