package ss13_Thuat_Toan_Xap_Xep.thuc_hanh;

public class SelectionSort {
    static double[] list={1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        for (int i=0;i< list.length-1;i++){
            double currenMin =list[i];
            int indexIn=i;
            for (int j=i+1;j< list.length;j++){
                if (currenMin>list[j]){
                    currenMin=list[j];
                    indexIn=j;
                }
            }
            if (indexIn!=i){
                list[indexIn]=list[i];
                list[i]=currenMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]+" "+"\t");
        }
    }

}
