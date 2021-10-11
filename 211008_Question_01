
/*
  Q. 키보드로 영문을 입력 받아 test.txt 파일로 저장하는 프로그램을 작성하라.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question01 {
  public static void main(String[] args) {
    
     Scanner scan = new Scanner(System.in);
     
     FileWriter fw = null;
     
     System.out.println("영문 입력");
     String text = scan.nextLine();
     
     try {
        fw = new FileWriter("파일 저장 위치");
        
        fw.write(text);
        fw.close();
        
        
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }
      
      System.out.println("저장 완료!");
      
   }
}
