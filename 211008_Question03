

/*
  파일 복사 프로그램을 만들어라. 단, FileReader와 FileWriter를 사용.
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question03 {
  public static void main(String[]  args) {
      
      FileReader fr = null;
      FileWriter fw = null;
      
      try {
          fr = new FileReader("파일을 불러올 위치");
          fw = new FileWriter("복사본을 저장할 위치");
          
          int readData = 0;
          
          System.out.println("데이터를 불러왔습니다.");
          
          while ((readData = fr.read()) != -1) {
              System.out.print((char)readData);
              
              fw.write(readData);              
          }
          
           System.out.println("데이터를 복사하여 저장했습니다.");
           
      } catch (FileNotFoundException e) {
          System.out.println(e.getMessage());
      } catch (IOException e) {
          System.out.println(e.getMessage());
      } finally {
          try {
              if (fr != null) fr.close();
              if (fw != null) fw.close();
          } catch (IOException e) {
              System.out.println(e.getMessage());
          }
      }
   }
}
        
