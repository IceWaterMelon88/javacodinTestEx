package string;

public class String_charAt_01 {

    public static void main(String[] args) {
        String nums1 = "123";
        String nums2 = "888";

        System.out.println(new String_charAt_01().solve(nums1, nums2));
    }

    public String solve(String num1, String num2){
        //1
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;

        //2
        while (num1Length >= 0 || num2Length >= 0){
            int n1 = 0, n2 = 0;
            if(num1Length >= 0){
               n1 = num1.charAt(num1Length) - '0';
            }
            if(num2Length >= 0){
               n2 = num2.charAt(num2Length) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum%10);
            num1Length--;
            num2Length--;
        }
        if(carry != 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
