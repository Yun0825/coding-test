import java.util.Scanner;

public class 회문문자 {
    public static String solution(String str){
        // My solution
//        str = str.toLowerCase();
//
//        String answer = "YES";
//
//        int lt = 0, rt = str.length()-1;
//        char[] s = str.toCharArray();
//
//        while(lt <= rt){
//            if(s[lt] != s[rt]){
//                answer = "NO";
//            }
//            lt++;
//            rt--;
//        }

        //Lecture's solution1
//        String answer = "YES";
//        str = str.toLowerCase();
//
//        int len = str.length();
//        for(int i =0; i < len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)){
//                answer = "NO";
//            }
//        }

        //Lecture's solution2
        String answer = "YES";
        String reversedWord = new StringBuilder(str).reverse().toString();
        if(!str.equals(reversedWord)) answer= "NO";

        return answer;
    }
    public static void main(String[] args) {
        회문문자 T = new 회문문자();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
