package ss3_Method.Thuc_Hanh;

public class Method_minimum {
    public static void main(String[] args) {
        int[]arr ={4,12,8,1,6,9};
        int index = minvalue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minvalue(int[] array){
        int index =0;
        for (int i=1;i<array.length;i++){
            if (array[i]<array[index]){
                index=i;
            }
        }
        return  index;
    }
}
