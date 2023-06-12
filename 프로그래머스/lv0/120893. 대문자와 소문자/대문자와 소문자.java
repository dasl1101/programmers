class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = new String[my_string.length()];
        //List<String> arr = Arrays.asList(my_string.split(""));
        for(int i = 0 ; i < my_string.length(); i++ ) {
        	if(Character.isUpperCase(my_string.charAt(i))) {
        		arr[i] = String.valueOf(my_string.charAt(i)).toLowerCase();
        	}else {
        		arr[i] = String.valueOf(my_string.charAt(i)).toUpperCase();
        	}
        }
        for(int i = 0 ; i < arr.length; i++){
            answer +=  arr[i].toString();
        
        }
        return answer;
    }
}