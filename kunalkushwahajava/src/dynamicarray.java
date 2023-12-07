import java.util.ArrayList;
import java.util.Scanner;

public class dynamicarray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
        list.add(64);
        list.add(74);
        list.add(734);
        list.add(387);
        System.out.println(list);
        list.set(0,99);
        for(int i=0;i<4; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);


    }

}
