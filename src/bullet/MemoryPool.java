package bullet;

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_Item = new LinkedList<>();

    public void freeItem(T item) {
        free_Item.add(item);
    }

    protected abstract T allocate();

    public T newItem() {
        T out = null;
        if (free_Item.size() == 0) {
            out = allocate();
        } else {
            out = free_Item.getFirst();
            free_Item.removeFirst();
        }
        return out;
    }
}
