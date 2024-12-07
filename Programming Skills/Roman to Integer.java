import java.util.*;
class Solution {
    Map<String,Integer> romanMap = new HashMap<>();
    Solution(){
        romanMap.put("I",1);
        romanMap.put("IV",4);
        romanMap.put("V",5);
        romanMap.put("IX",9);
        romanMap.put("X",10);
        romanMap.put("XL",40);
        romanMap.put("L",50);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("D",500);
        romanMap.put("CM",900);
        romanMap.put("M",1000);
        romanMap.put("C",100);
    }
    public int romanToInt(String s) {        
        int sum = 0;      
        int tracker = 0;
        while(tracker < s.length()){
            if(tracker < s.length() - 1){
                System.out.println((""+s.charAt(tracker))+(""+s.charAt(tracker+1)));
               if(romanMap.containsKey((""+s.charAt(tracker))+(""+s.charAt(tracker+1)))){
                    sum += romanMap.get((""+s.charAt(tracker))+(""+s.charAt(tracker+1)));
                    tracker += 2;
               }else{
                    sum += romanMap.get(s.charAt(tracker)+"");
                    tracker++;
               }
            }
            else{
                sum += romanMap.get(s.charAt(tracker)+"");
                tracker++;
            }
        }
        return sum;
    }
}
