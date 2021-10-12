/*

영어 단어와 뜻을 키보드로 입력 받아 PrintWriter를 사용해서 파일로 저장하라.

*/


public class Question_01 {
  public static void main(String[] args) {
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
                         
     try {
          printWriter pw = new PrintWriter("Question_01.txt");
       
          System.out.println("0을 누르면 종료");
       
          while(!(br.readLine().equals("0"))) {
                System.out.println("영어 단어를 입력하세요.");
                pw.print(br.readLine() + ",");
            
                System.out.println("영어 단어에 대한 뜻을 입력하세요.");
                pw.println(br.readLine());
           }
       
       br.close();
       pw.close();
                
       System.out.println("파일이 저장 되었습니다.");
       
     } catch (IOException ie) {
          System.out.println(ie.getMessage());
     }
                                           
  }
}
