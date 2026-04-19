import java.util.*;

public class Union {

    public static void main(String [] args)
    {
        int nums1[]={1,2,2,3};
        int nums2[]={2,3,4,5};

        Set<Integer> s=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            s.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            s.add(nums2[i]);
        }

        System.out.println(s);
    }
    
}
