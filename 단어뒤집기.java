import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
 //   public static ArrayList<String> solution(String[] str){
        // My solution
//        int length =str.length;
//        String[] reverseWords = new String[length];
//        StringBuilder sb;
//
//        for(int i =0; i < length; i++){
//            sb = new StringBuilder(str[i]).reverse();
//            reverseWords[i] = sb.toString();
//        }

        // Lecture's solution1
//        ArrayList<String> reverseWords = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            reverseWords.add(tmp);
//        }

        // Lecture's solution2
//        ArrayList<String> reverseWords = new ArrayList<>();
//
//        for(String x : str){
//            char[] s = x.toCharArray(); // char 배열로 만들기
//            int lt = 0, rt = x.length() -1;
//            while(lt < rt){
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//
//            String tmp = String.valueOf(s);
//            reverseWords.add(tmp);
//        }
//
//        return reverseWords;
//    }
//
//    public static void main(String[] args) {
//        단어뒤집기 T = new 단어뒤집기();
//        Scanner kb = new Scanner(System.in);
//
//        int num = kb.nextInt();
//        String[] str = new String[num];
//
//        for(int i =0; i < num; i++){
//            str[i] = kb.next();
//        }
//
//        String[] arr = T.solution(str);
//
//        for(int i =0; i < num; i++){
//            System.out.println(arr[i]);
//        }
//    }
}
