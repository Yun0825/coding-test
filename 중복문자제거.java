import java.util.Scanner;

public class 중복문자제거 {
    public static String solution(String str){

        String answer = "";
        int len = str.length();

        for(int i = 0; i < len; i++){

            if(i == str.indexOf(str.charAt(i))){
                answer += Character.toString(str.charAt(i));
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        중복문자제거 T = new 중복문자제거();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
