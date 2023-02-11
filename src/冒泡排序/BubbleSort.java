package 冒泡排序;

public class BubbleSort {
    public static void code_00_bubblesort(int[] arr){
        /*当数组为空或者是长度为1时，不排序*/
        if(arr.length<2){
            return;
        }
        for(int end=arr.length-1;end>0;end--){
            for(int i=0;i<end;i++){
                if(arr[i]>arr[i+1]){
                    swap(i,i+1,arr);
                }
            }
        }
    }
    public static void swap(int i,int j,int[] arr){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}
