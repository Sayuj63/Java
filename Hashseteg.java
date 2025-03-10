// import java.util.*;
// public class arraylisteg {
//     public static void main(String[] args) {
//         ArrayList<String> fruits = new ArrayList<String>();
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Cherry");
//         System.out.println(fruits);
//             fruits.remove("Apple");
//             System.out.println("After removing apple"+fruits);
//             fruits.set(1,"Blueberry");
//             System.out.println("After updating elements"+fruits);
//             System.out.println("get elements from arraylist index is"+fruits.get(1));
//             for (String fruit:fruits){
//                 System.out.println(fruit);
//             }



//     }
    
// }

// import java.util.*;
// public class collection {
//     public static void main(String []args){
//         LinkedList<String> fruits =new LinkedList<>();
//         fruits.add("apple");
//         fruits.add("mango");
//         fruits.add("melon");
//         fruits.add("watermelon");
//         fruits.add("tomato");
//         System.out.println(fruits);
//         fruits.addFirst("carrit");
//         fruits.addLast("banana");
//         fruits.removeLast();
//         fruits.removeFirst();
//         System.out.println(fruits);
//         fruits.removeLast();
//         fruits.removeFirst();
//         System.out.println(fruits);
//     }
// }




import java.util.*;
public class Hashseteg {
    public static void main(String []args){
        Set<String> set =new HashSet<>();
        set.add("apple");
        set.add("mango");
        set.add("melon");
        set.add("watermelon");
        
        System.out.println(set);
        System.out.println(set.contains("apple"));
        set.remove("apple");
        System.out.println(set.size());
    }
}