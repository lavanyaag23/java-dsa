package ArrayList;

import java.util.*;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //Add at index
        list.add(1,40);
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        //set
        list.set(2,50);
        System.out.println(list.get(2));

        //remove
        list.remove(2);
        System.out.println(list);
        
        //size
        System.out.println(list.size());

        sc.close();
    }
}

