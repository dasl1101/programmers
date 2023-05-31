class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int a = 0;
        int b = 0;
        String[] arr = polynomial.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                if (arr[i].length() == 1) {
                    a += 1;
                } else {
                    String coefficient = arr[i].replace("x", "");
                    a += Integer.parseInt(coefficient);
                }
            } else if (Character.isDigit(arr[i].charAt(0))) {
                b += Integer.parseInt(arr[i]);
            }
        }

        if (a != 0) {
            if (a != 1) {
                answer += a + "x";
            } else {
                answer += "x";
            }
        }

        if (b != 0) {
            if (a != 0) {
                if (b > 0) {
                    answer += " + " + b;
                } else {
                    answer += " + " + b;
                }
            } else {
                answer += b;
            }
        } else if (answer.equals("")) {
            answer = "0";
        }

        return answer;
    }
}