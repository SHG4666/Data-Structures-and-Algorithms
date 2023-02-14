package 递归测试;
import java.lang.Math;

public class Recursion {
    public static int getMax(int[] arr,int L,int R){
        if(L==R){
            return arr[L];
        }
        int mid =(L+R)/2;
        int maxLeft = getMax(arr,L,mid);
        int maxRight = getMax(arr,mid+1,R);
        return Math.max(maxLeft,maxRight);
    }

}
