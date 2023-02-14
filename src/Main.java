import 冒泡排序.BubbleSort;
import 选择排序.SelectSort;
import 排序测试.SortTest;
import 插入排序.InsertSort;
import 递归测试.Recursion;
public class Main {
    public static void main(String[] args) {
//        int testTime = 500000;
//        int maxSize = 100;
//        int maxValue = 100;
//        boolean succeed = true;
//        for(int i = 0;i<testTime;i++){
//            int[] arr1 =SortTest.generateRandomArray(maxSize,maxValue);
//            int[] arr2 = SortTest.copyArray(arr1);
//            int[] arr3 =SortTest.copyArray(arr1);
////            BubbleSort.code_00_bubblesort(arr1);
//            InsertSort.code_01_insertSort(arr1);
//            SortTest.rightMathod(arr2);
//            if(!SortTest.isEqual(arr1,arr2)){
//                succeed =false;
//                SortTest.printArray(arr3);
//                break;
//            }
//        }
//        System.out.println(succeed ? "Nice" : "Fucking fucked!");
//    }
        int[] arr = {10,9,88,7,6,5,4, 3, 23, 1};
        System.out.println(Recursion.getMax(arr, 0, arr.length - 1));
    }
}