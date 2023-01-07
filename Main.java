import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실행할 정렬을 선택해주세요");
        System.out.println("1. Selection Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");

        int sortNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("숫자들을 입력해주세요 ex)1,3,5,7,9");

        String[] numberArray = scanner.nextLine().split(",");
        List<Integer> numberList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        for (String s : numberArray) {
            numberList.add(Integer.parseInt(s));
        }

        switch (sortNum) {
            case 1:
                sortedList = SelectionSort.sort(numberList);
                break;
            case 2:
                sortedList = QuickSort.sort(numberList);
                break;
            case 3:
                sortedList = MergeSort.sort(numberList);
            default:
                break;
        }

        System.out.println("정렬 결과를 출력합니다.");
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.print(sortedList.get(i));
            if (i + 1 < sortedList.size()) {
                System.out.print(",");
            }
        }
    }
}
