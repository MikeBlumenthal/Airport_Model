import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void beforeEach(){
        passenger = new Passenger("Mike", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", passenger.getName() );
    }

    @Test
    public void hasWallet(){
        assertEquals(100, passenger.getWallet() );
    }
}
