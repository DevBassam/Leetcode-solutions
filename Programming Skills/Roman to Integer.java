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


/*

// Very interseted and smart solution "not mine"
 public int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

*/
