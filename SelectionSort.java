import java.util.List;

/**
 * 선택정렬
 *
 * 시간복잡도
 * 최선 : O(n^2)
 * 평균 : O(n^2)
 * 최악 : O(n^2)
 * */
public class SelectionSort {
    public static List<Integer> sort(List<Integer> numberList) {
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i; j < numberList.size(); j++) {
                if (numberList.get(j) < numberList.get(i)) {
                    int temp = numberList.get(j);
                    numberList.set(j, numberList.get(i));
                    numberList.set(i, temp);
                }
            }
        }

        return numberList;
    }
}
