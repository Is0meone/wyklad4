import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
    ArrayList<String> message = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner u_input = new Scanner(System.in);
    String cos = "gf";
    int flaga;
    int i = 0 ;
    System.out.println(i);
    while(true){
        message.add(u_input.nextLine());
        try{
            flaga = Integer.parseInt(message.get(i));
            numbers.add(flaga);

        }
        catch(Exception e)
        {
            break;
        }
        System.out.println("Done "+ message.get(i));
        i++;
        }
        int[] tab =
                numbers.stream().mapToInt(Integer::intValue).toArray();
        BubbleSort.bubbleSort(tab);
        BubbleSort.printTable(tab, "po sortowaniu:");
    }
}
