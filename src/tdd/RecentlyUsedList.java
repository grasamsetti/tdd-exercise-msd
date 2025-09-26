package tdd;

import java.util.LinkedList;
import java.util.List;


public class RecentlyUsedList {
    private final List<Integer> items = new LinkedList<>();

    public List<Integer> getItems() {
        return items;
    }

    public List<Integer> addToList(Integer item) {
        items.remove(item);
        items.addFirst(item);
        return items;
    }

    public int readFromList(int index) {
        return items.get(index);
    }
}
