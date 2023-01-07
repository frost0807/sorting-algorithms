import java.util.ArrayList;
import java.util.List;

/**
 * 병합정렬
 *
 * 시간복잡도
 * 최선 : O(nlogN)
 * 평균 : O(nlogN)
 * 최악 : O(nlogN)
 * */
public class MergeSort {
    public static List<Integer> sort(List<Integer> numberList) {
        if (numberList.size() <= 1) {
            return numberList;
        }
        int mid = numberList.size() / 2;
        int leftIndex = 0;
        int rightIndex = 0;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftList.add(numberList.get(i));
        }
        for (int i = mid; i < numberList.size(); i++) {
            rightList.add(numberList.get(i));
        }

        List<Integer> leftResultList = sort(leftList);
        List<Integer> rightResultList = sort(rightList);

        while (leftIndex < leftResultList.size() && rightIndex < rightResultList.size()) {
            int leftElement = leftResultList.get(leftIndex);
            int rightElement = rightResultList.get(rightIndex);

            if (leftElement < rightElement) {
                resultList.add(leftElement);
                leftIndex++;
            } else {
                resultList.add(rightElement);
                rightIndex++;
            }
        }
        while (leftIndex < leftResultList.size()) {
            resultList.add(leftResultList.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < rightResultList.size()) {
            resultList.add(rightResultList.get(rightIndex));
            rightIndex++;
        }

        return resultList;
    }
}
