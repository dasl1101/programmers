import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); 

            if (diff < min) {
                min = diff;
                answer = array[i];
            } else if (diff == min) {
                answer = Math.min(answer, array[i]);
            } else {
                break;
            }
        }

        return answer;
    }
}