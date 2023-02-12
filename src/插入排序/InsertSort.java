package 插入排序;

public class InsertSort {
    public static void code_01_insertSort(int[] arr){
        if(arr.length <2){
            return;
        }
        for(int i =1;i<arr.length;i++){
            for(int j =i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp =arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
    }
}
