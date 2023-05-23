import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] ca = my_string.toCharArray();
        
        for(int i = 0; i<ca.length; i++) {
            if(!sb.toString().contains(String.valueOf(ca[i]))) sb.append(ca[i]);
        }
        return String.valueOf(sb);
    }
}