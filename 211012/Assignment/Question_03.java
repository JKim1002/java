/*
학생 번호, 이름, 국어 점수를 입력 받아 학점을 계산해서 DataOutputStream을 이용하여 파일로 저장하라.
(파일에 학생번호, 이름, 국어, 학점 저장)
*/



import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question_03 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    try {
      DataOutputStream dos = new DataOutputStream(new FileOutputStream("Question_03.data");
                                                  
      System.out.println("학생 번호를 입력하세요.");
      Stirng num = scan.next();                                                  
                                                  
      System.out.println("이름을 입력하세요.");
      String name = scan.next();

      System.out.println("국어 점수를 입력하세요.");
      String kor = scan.next();                                                  


      dos.writeUTF("학생번호: " + num);
      dos.writeUTF("이름: " + name);
      dos.writeUTF("국어점수: " + kor);

      int kor_score = Integer.parseInt(kor);

      if (kor_score >= 90) {
          dos.writeUTF("학점: " + "A");
      } else if (kor_score >= 80) {
          dos.writeUTF("학점: " + "B");
      } else if (kor_score >= 70) {
          dos.writeUTF("학점: " + "C");
      } else if (kor_score >= 60) {
          dos.writeUTF("학점: " + "D");
      } else {
          dos.writeUTF("학점: " + "F");
      }
                                                  
      dos.close();

      System.out.println("파일을 저장했습니다.");                                                  
                                                  
      } catch (IOException ie) {
          System.out.println(ie.getMessage());
      }
                                                  
  }
}
