import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
    static void
    readArrList(ArrayList<Integer> arr) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int i = 0;
        while (sc.hasNextInt() && i < N) {
            arr.add(sc.nextInt());
            i++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        readArrList(arr);
        int[] tab =
                arr.stream().mapToInt(Integer::intValue).toArray();
    //System.out.println(Arrays.toString(tab));
        BubbleSort.printTable(tab, "przed sortowaniem:");
        BubbleSort.bubbleSort(tab);
        BubbleSort.printTable(tab, "przed sortowaniem:");
    }

    }