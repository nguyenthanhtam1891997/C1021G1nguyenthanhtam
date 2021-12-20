package ss13_Thuat_Toan_Xap_Xep.bai_tap;

public class InsertionSort {
    public static int[] list={2,3,2,5,6,1,-2,3,14,12};
    public static void insertionSort(int[] list){
        int index,value;
        for (int i=1;i<list.length;i++){
            value=list[i];
            index=i;
            for (;index>0&&value<list[index-1];index--){
                list[index]=list[index-1];
            }
            list[index]=value;
            System.out.println("\n");
            for (int x=0;x<list.length;x++){
                System.out.print(list[x]+"\t");

            }
        }

    }
    public static void main(String[] args) {
        insertionSort(list);
        System.out.println(" ");
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
    }
}
