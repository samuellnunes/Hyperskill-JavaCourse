import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

class MyList {

    public void removeDuplicates(AtomicReference<List<Integer>> ref) {
        while (true) {
            List<Integer> current = ref.get();

            Set<Integer> set = new TreeSet<>(current);
            List<Integer> updated = new ArrayList<>(set);

            if (ref.compareAndSet(current, updated)) {
                break;
            }
        }
    }
}