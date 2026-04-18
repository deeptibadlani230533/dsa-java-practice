import java.util.*;
public class CountDistinctOptimized {
    public static void main(String[] args) {
        int arr[]={3,1,4,1,5,9,2,6,5,3};

        Set<Integer> seen=new HashSet<>();
        

        for(int i=0;i<arr.length;i++)
        {
            seen.add(arr[i]);
        }
        

        System.out.println(seen.size());

    
    }
    
}
