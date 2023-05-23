import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> arr = new ArrayList<Integer>();
        while(true){
            if(n%2==0){
                arr.add(n);
                n /= 2;
            }else{
                arr.add(n);
                n = 3*n+1;
            }
            
            if(n==1){
                arr.add(n);
                break;
            }
        }
        int[] answer = new int[arr.size()];
        
        for(int i = 0 ; i < arr.size(); i++){
            answer[i] = arr.get(i);
           // System.out.println(answer[i]);
        }
        
        return answer;
    }
}