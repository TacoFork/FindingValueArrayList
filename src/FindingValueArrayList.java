import java.util.ArrayList;
import java.util.Scanner;
public class FindingValueArrayList {
    public static void main(String[] args){
        ArrayList<Integer> int_list= new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int_list.add(5);
        int_list.add(49);
        int_list.add(25);
        int_list.add(32);
        int_list.add(6);
        int_list.add(18);
        int_list.add(43);
        int_list.add(9);
        int_list.add(22);
        int_list.add(5);

        System.out.println(int_list);
        System.out.print("Choose a value to find: ");
        int find = keyboard.nextInt();
        for (int index = 0; index < int_list.size(); index++){
            if (int_list.get(index) == find){
                System.out.println(find + " is in the ArrayList");
                break;
            }
        }
    }

}
