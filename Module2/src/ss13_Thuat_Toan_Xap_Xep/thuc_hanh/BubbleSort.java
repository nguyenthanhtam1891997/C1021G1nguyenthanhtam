package ss13_Thuat_Toan_Xap_Xep.thuc_hanh;

public class BubbleSort {
    static int[] list ={2,3,2,5,6,1,-2,3,14,12};
    public static void bubble(int[] list){
        boolean check= true;
        for (int k =1;k< list.length&&check;k++){
            check=false;
            for (int i=0;i< list.length-k;i++){
                if (list[i]>list[i+1]){
                    int temp =list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    check=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubble(list);
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]+" ");
        }
    }
}
