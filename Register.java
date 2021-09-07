package practice;

import java.io.*;
import java.util.*;

// For problem statement in classes and objects
class Register {
    
    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */
     
     public static Register getInstance(){
         if (register == null){
             register = new Register();
         }
         return register;
     } 

    public String getTotalBill(Map<String,Integer> itemDetails) {
        Map<String,Float> itemCostMap = new HashMap<String,Float>();
        itemCostMap.put("apple", (float) 2.0);
        itemCostMap.put("orange", (float) 1.5);
        itemCostMap.put("mango", (float) 1.2);
        itemCostMap.put("grape", (float) 1.0);
        Iterator<String> ite = itemDetails.keySet().iterator();
        float cost = 0;
        while(ite.hasNext()) {
            String s = ite.next();
            //System.out.println("fruit: " + s);
            switch(s){
                case "apple":
                    cost+= itemDetails.get(s) * itemCostMap.get(s);
                    //System.out.println("itemDetails.get(s) " + itemDetails.get(s) + "itemCostMap.get(s)" + itemCostMap.get(s));
                    //System.out.println("cost :" + cost);
                    break;
                case "orange":
                    cost+= itemDetails.get(s) * itemCostMap.get(s);
                    //System.out.println("itemDetails.get(s) " + itemDetails.get(s) + "itemCostMap.get(s)" + itemCostMap.get(s));
                    //System.out.println("cost :" + cost);
                    break;
                case "mango":
                    cost+= itemDetails.get(s) * itemCostMap.get(s);
                    //System.out.println("itemDetails.get(s) " + itemDetails.get(s) + "itemCostMap.get(s)" + itemCostMap.get(s));
                    //System.out.println("cost :" + cost);
                    break;
                case "grape":
                    cost+= itemDetails.get(s) * itemCostMap.get(s);
                   // System.out.println("itemDetails.get(s) " + itemDetails.get(s) + "itemCostMap.get(s)" + itemCostMap.get(s));
                   // System.out.println("cost :" + cost);
                    break;
                default:
                   System.out.println("Specified fruit is not in the list.");
            } 
        }
        return Float.toString(cost);

        // Write your code here

    }

}
