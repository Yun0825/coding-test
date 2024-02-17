import java.util.Scanner;

public class 문자찾기 {
    public int solution(String str, char c){
        int answer = 0;
        // 대문자로 바꾼다
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자찾기 T = new 문자찾기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
