/*
Question_03의 파일 정보를 읽어와서 화면에 출력하라.
*/

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Question_04 {
    public static void main(String[] args) {
        
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("Question_03.data");
            
            // String 타입으로 작성된 파일이며, 순차적으로 불러오기 때문에 String 개수만큼 입력 함.                                                     
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            SYstem.out.println(dis.readUTF());
                                                      
            dis.close();
                                                      
        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        }
                                                      
    }
}
