package string;

import java.sql.SQLOutput;

public class Test_chartAc_02 {

    public static void main(String[] args) {
        String s = "(a(b(c)d)";

        System.out.println("result" + new Test_chartAc_02().soleve(s));
    }

    public String soleve(String s){

        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int openBrace =0;

        for (char c :s.toCharArray()){
            if (c == '('){
                openBrace ++;
            }else if(c == ')'){
                if (openBrace == 0)continue;
                openBrace --;
            }
            sb.append(c);
        }

        for(int i = sb.length()-1; i >= 0; i -- ){
            if(sb.charAt(i) == '(' && openBrace-- > 0)continue;
            result.append(sb.charAt(i));
        }

        return result.reverse().toString();
    }



}
