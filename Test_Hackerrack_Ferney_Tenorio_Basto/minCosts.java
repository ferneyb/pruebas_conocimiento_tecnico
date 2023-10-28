import java.util.*;
public class minCosts {


    public static int minCost(List<List<Integer>> cost) {
// Write your code here
        int logitud,costoMinimo;
        Integer[][] const1= new Integer[cost.size()][];
        Integer[] const2= new Integer[0];

        for(int i=0; i<cost.size(); i++) {
            const1[i]=cost.get(i).toArray(const2);
        }

        for(int i=1; i<const1.length; i++) {
            const1[i][0]+=Math.min(const1[i-1][1],const1[i-1][2]);
            const1[i][1]+=Math.min(const1[i-1][0],const1[i-1][2]);
            const1[i][2]+=Math.min(const1[i-1][0],const1[i-1][1]);

        }

        logitud=const1.length;
        costoMinimo=Math.min(const1[logitud-1][0],Math.min(const1[logitud-1]
                             [1],const1[logitud-1][2]));

        return costoMinimo;
    }

}