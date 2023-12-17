import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            array.add(i);
        }
        System.out.println(array);
        int index = search.binarySearchArray(array, 8);
        System.out.println(index);
    }
}