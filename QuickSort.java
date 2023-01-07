import java.util.ArrayList;
import java.util.List;

/**
 * 퀵정렬
 *
 * 시간복잡도
 * 최선 : O(nlogN)
 * 평균 : O(nlogN)
 * 최악 : O(n^2)
 */
public class QuickSort {
    public static List<Integer> sort(List<Integer> numberList) {
        if (numberList.size() <= 1) {
            return numberList;
        }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = numberList.get(0);

        for (int i = 1; i < numberList.size(); i++) {
            int number = numberList.get(i);

            if (number <= pivot) {
                left.add(number);
            } else {
                right.add(number);
            }
        }
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(sort(left));
        resultList.add(pivot);
        resultList.addAll(sort(right));

        return resultList;
    }
}
