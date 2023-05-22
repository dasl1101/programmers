
import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> arr = new HashSet<Integer>();
       for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                arr.add(i);
                n /= i;
            }
        }
      List<Integer> list = new ArrayList<>(arr);
        Collections.sort(list);
      int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i ++){
            answer[i] = list.get(i);
            
        }
        
        return answer;
    }
}