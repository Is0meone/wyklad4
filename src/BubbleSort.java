public class BubbleSort {
    static int bubbleSort(int[] tab) {
        int flag =0;
        for(int i =0; i < tab.length;i++){
            for(int j = 0;j < tab.length-1;j++){
                if(tab[j]>=tab[j+1]){
                    flag = tab[j+1];
                    tab[j+1] = tab[j];
                    tab[j] = flag;
                }
            }
        }
        return 0;
    }
    static void printTable(int[] tab, String nap) {
        for(int i = 0;i<tab.length;i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int tab[] = { 7, 2,-1, 0, -7, 3, 5, 9, 4, 6 };
        printTable(tab, "przed posortowaniem:");
        bubbleSort(tab);
        printTable(tab, "po posortowaniu:");
    }
}
