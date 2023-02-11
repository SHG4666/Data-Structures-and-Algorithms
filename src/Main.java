import 冒泡排序.BubbleSort;
import 选择排序.SelectSort;
public class Main {
    public static void main(String[] args) {
        int[] arr ={2,1,33,5,22,7,8,2,5,4};
//        BubbleSort bubbleSort =new BubbleSort();
//        bubbleSort.code_00_bubblesort(arr);
        SelectSort.code_02_seletSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}