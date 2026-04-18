import java.util.*;
public class HashSetOperations {
    public static void main(String args[])
    {
        Set<String> h=new HashSet<String>();
        h.add("Deepti");
        h.add("DSA");
        h.add("count");

        System.out.println(h);
        System.out.println(h.size());

        h.remove("DSA");
        System.out.println(h.size());


        System.out.println(h.contains("course"));
        System.out.println(h.contains("count"));

        for(String s:h)
        {
            System.out.println(s + " ");
        }

        System.out.println(h.isEmpty());



    }


}
