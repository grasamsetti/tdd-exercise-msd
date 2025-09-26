package tdd;

import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList {
    private final List<Integer> items = new LinkedList<>();

    public List<Integer> getItems() {
        return items;
    }
}
