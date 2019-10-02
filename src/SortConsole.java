import java.util.Arrays;

public class SortConsole {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SortAlgoFactory factory = new SortAlgoFactory();
        Sort sortObj = factory.getInstance("merge");
        sortObj.sort(arr, arr.length);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
