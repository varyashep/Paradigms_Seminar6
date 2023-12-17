import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public int binarySearchArray(List<Integer> sortedArray, int value, int start, int end) {
        int mid = start + ((end - start)/2);

        if (start > end) {
            return -1;
        }

        if (value == sortedArray.get(mid)) {
            return mid;
        }
        else if (value < sortedArray.get(mid)) {
            return binarySearchArray(sortedArray, value, start, mid);
        }
        else {
            return binarySearchArray(sortedArray, value, mid+1, end);
        }
    }

    public int binarySearchArray(List<Integer> sortedArray, int value) {
        return binarySearchArray(sortedArray, value, 0, sortedArray.size()-1);
    }
}
