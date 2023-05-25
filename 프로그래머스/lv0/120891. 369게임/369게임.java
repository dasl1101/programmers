class Solution {
    public int solution(int order) {
         String os = "" + order;
        int count = 0;
        for (int i = 0; i < os.length(); i++) {
            if (os.charAt(i) == '3'|| os.charAt(i) == '6'
                    || os.charAt(i) == '9') {
                    count++;
            }
        }
        return count;
    }
}