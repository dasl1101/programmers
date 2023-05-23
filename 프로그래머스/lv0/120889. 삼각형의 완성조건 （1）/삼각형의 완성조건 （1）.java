class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum=0;
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
            max = Math.max(max, sides[i]);
        }
        
        int sum2 = sum - max;
        
        
        if (sum2>max){
            answer = 1;
            
        }else answer = 2;
        return answer;
    }
}