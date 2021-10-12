/*
Question_01에서 작성된 텍스트 파일을 이용하여 영어단어를 검색하면 
그 뜻이 나오도록 프로그램을 작성하시오.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Question_02 {
    public static void main(String[]  args) {
          
          Scanner scan = new Scanner(System.in);
      
          HashMap<String, String> word = new HasMap<>();
      
        
          try {
              BufferedReader br = new BufferedReader(new FileReader("Question_01.txt");
                                                     
               String[] aa = br.readLine().split(",");    // 첫 번째 줄을 불러와서 split으로 나눈 후 aa배열 변수에 삽입
               String[] bb = br.readLine().split(",");    // 두 번째 줄 불러와서 쪼개기
               String[] cc = br.readLine().split(",");    // 세 번째 줄 불러와서 쪼개기
                                                     
               String a1 = aa[0];
               String a2 = aa[1];
                                                     
               String b1 = bb[0];                                      
               String b2 = bb[1];    
                                                     
               String c1 = cc[0];
               String c2 = cc[1];                                      
                                                     
               word.put(a1,a2);                                      
               word.put(b1,b2);                                      
               word.put(c1,c2);                                      
                                                     
               System.out.println("영어 단어를 검색하세요.");                                      
                                                     
               String w = word.get(scan.next());                                      
                                                     
               if(w != null) {                                      
                  System.out.println("뜻: " + w);
               } else {
                    System.out.println("해당 단어는 존재하지 않습니다.");
               }
                                                     
           } catch (IOException ie) {
                System.out.println(ie.getMessage());
           }
     }
}
                                                     
                                                     
                                                     
                                                     
