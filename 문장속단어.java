import java.util.Scanner;

public class 문장속단어 {
    public String solution(String str){
        // case1
//        String[] newStr = str.split(" ");
//
//        String answer = "";
//        int max = Integer.MIN_VALUE;
//
//        for(String data : newStr){
//            int value = data.length();
//            if(value > max) {
//                max = value;
//                answer = data;
//            }
//       }

        // case2
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        //indexOf : 인덱스 번호 return

        while((pos=str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }

            str = str.substring(pos+1);
        }

        if(str.length() > max) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        문장속단어 T = new 문장속단어();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}