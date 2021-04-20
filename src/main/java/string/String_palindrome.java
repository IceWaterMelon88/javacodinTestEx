package string;

public class String_palindrome {

    public static void main(String[] args) {
        String_palindrome a = new String_palindrome();
        String s = "bananas";
        System.out.println(a.solve(s));
    }

    private int start, end;

    public String solve(String s){
        int len = s.length();
        if(len < 2) return s;

        for(int i = 0; i < len-1; i++){
            findSubstring(s, i, i);
            findSubstring(s, i ,i+1);
        }
        return s.substring(start, start + end);

    }

    private void findSubstring(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        if( end < right - left -1){
            end = right - left -1;
            start = left +1;
        }
    }
}
