import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < my_string.length(); i++){
            if(my_string.charAt(i)-48 >=0 && my_string.charAt(i)-48 <=9){
                arr.add((int)(my_string.charAt(i)-48));
            }
        }
        for(int i = 0 ; i<arr.size() ; i++){
            answer += arr.get(i);
            
        }
        
        return answer;
    }
}