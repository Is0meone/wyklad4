import java.util.Scanner;

    public class TabTest {
        public static void main(String[] args) {
            int N=10;
            int[] tab = new int[N];
            readArr(tab);
            BubbleSort.printTable(tab, "przed sortowaniem:");
            BubbleSort.bubbleSort(tab);
            BubbleSort.printTable(tab, "po sortowaniu:");
            System.out.print("DOKONALO SIE");
        }

        static void readArr(int[] tab) {
            Scanner sc = new
                    Scanner(System.in);
            int N = tab.length;
            int i = 0;
            while (sc.hasNextInt() && i < N)
                tab[i++] = sc.nextInt();
        }
    }

