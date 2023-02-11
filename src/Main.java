import 冒泡排序.BubbleSort;
public class Main {
    public static void main(String[] args) {
        int[] arr ={2,4,1,8,4,8,9,22,66,9,77,0,32,66,44,13};
        BubbleSort bubbleSort =new BubbleSort();
        bubbleSort.code_00_bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}