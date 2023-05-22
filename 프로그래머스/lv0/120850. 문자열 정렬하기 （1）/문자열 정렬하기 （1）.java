import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i <my_string.length() ; i++){
            if(my_string.charAt(i)-48 >=0 && my_string.charAt(i)-48 <= 9){
                answer.add((int)(my_string.charAt(i)-48));
            } 
        }   
        
        int[] answer1 = new int[answer.size()];
         for (int i = 0 ; i < answer.size() ; i++){
            answer1[i] = answer.get(i).intValue(); 
         }
        
        Arrays.sort(answer1); 
        return answer1;
    }
}