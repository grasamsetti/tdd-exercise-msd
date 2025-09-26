package tdd;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;

public class RecentlyUsedListTest {

    @Test
    public void listEmptyWhenInitialized(){
        assertTrue(new RecentlyUsedList().getItems().isEmpty());
    }

    @Test
    public void addedToList(){
        assertTrue(new RecentlyUsedList().addToList(2).contains(2));
    }

    @Test
    public void canReadFromList(){
        RecentlyUsedList list = new RecentlyUsedList();
        list.addToList(1);
        list.addToList(2);
        list.addToList(3);
        assertThat(list.readFromList(0),is(3));
        assertThat(list.readFromList(1), is(2));
        assertThat(list.readFromList(2), is(1));
    }
}
