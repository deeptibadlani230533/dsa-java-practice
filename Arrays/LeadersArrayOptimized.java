//Optimized
import java.util.*;
public class LeadersArrayOptimized {
    public static void findLeaders(int arr[]) {
        int n = arr.length;

        int leader=arr[n-1];
        System.out.print(leader+" ");

        for (int i = n-2; i >= 0; i--) {
            if(arr[i]>leader)
            {
                leader=arr[i];
                System.out.print(leader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 17, 5, 2};
        findLeaders(arr);
    }
}

