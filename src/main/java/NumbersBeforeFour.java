import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersBeforeFour {

    public int[] numbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 4) {
                list.add(arr[i]);
            } else if (arr[i] == 4) {
                break;
            }
        }
        int[] result = new int[list.size()];

        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            result[j] = list.get(i);
        }


        return result;
    }
}
