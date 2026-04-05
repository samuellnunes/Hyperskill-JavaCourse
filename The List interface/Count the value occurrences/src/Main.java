import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count1 = 0;
        int count2 = 0;

        for (int num : list1) {
            if (num == elem) {
                count1++;
            }
        }

        for (int num : list2) {
            if (num == elem) {
                count2++;
            }
        }

        return count1 == count2;
    }
}