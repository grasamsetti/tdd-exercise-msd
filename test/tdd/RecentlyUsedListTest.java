package tdd;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    @Test
    public void listEmptyWhenInitialized(){
        assertTrue(new RecentlyUsedList().getItems().isEmpty());
    }
}
