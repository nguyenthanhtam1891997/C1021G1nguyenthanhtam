package ss9_DSA_List.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(3);
        ListInteger.add(4);
        System.out.println("element 4: "+ListInteger.get(4));
        System.out.println("element 1: "+ListInteger.get(1));
        System.out.println("element 2: "+ListInteger.get(2));

//        ListInteger.get(6);
//        System.out.println("element 6: "+ListInteger.get(6));

        ListInteger.get(-1);
        System.out.println("element -1: "+ListInteger.get(-1));
    }
}
