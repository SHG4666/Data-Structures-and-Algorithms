package 排序测试;
import java.util.Arrays;
public class SortTest {
    /**
     * 打印数组的内容
     * @param arr 需要打印的传入的数组
     */
    public static void printArray(int[] arr){
        if(arr ==null){
            return;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    /**
     * 复制一个一摸一样的数组
     * @param arr 需要复制的数组
     * @return 返回复制完成数组的索引
     */
    public static int[] copyArray(int[] arr){
        if(arr ==null){
            return null;
        }
        int[] res = new int[arr.length];
        for(int i =0; i<arr.length;i++){
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 判断两个数组是否相等
     * @param arr1 传入的数组1
     * @param arr2 传入的数组2
     * @return 返回判断的结果
     */
    public static boolean isEqual(int[] arr1,int[] arr2){
        if((arr1 == null && arr2!=null)||(arr1!=null && arr2 == null)){
            return false;
        }
        if(arr1 == null && arr2 == null){
            return false;
        }
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * 生成随机的数组
     * @param size 生成数组的长度
     * @param value 数组中的值
     * @return 返回生成的数组
     */
    public static int[] generateRandomArray(int size,int value){
        //生成长度随机的数组
        int[] arr = new int[(int)((size+1)*Math.random())];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }

    /**
     * 调用java自带的排序方法
     * @param arr 导入要排序数组
     */
    public static void rightMathod(int[] arr){
        Arrays.sort(arr);
    }
}
