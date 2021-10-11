/*
  프로그램을 실행하면 test.txt 파일의 모든 내용을 대문자로 변환해 upper_test.txt 파일에 저장되도록 만들어라.
*/



public class Question02 {
  public static void main(String[] args) {
      
      ArrayList<Integer> list = new ArrayList<>();    // 정수형으로 반환되는 값을 저장하기 위해 배열객체 생성.
      
      FileReader fr = null;   
      FileWriter fw = null;
      
      String output = "";     // 정수형을 캐릭터형으로 변환하여 문자로 저장할 수 있도록 변수 선언.
      
      try {
        fr = new FileReader("저장된 파일의 위치");
        fw = new FileWriter("저장할 파일의 위치");
        
        int readData = 0;
        
        while((readData = fr.read()) != -1) {
          list.add(readData);     // 읽어 온 정수형 문자들을 배열로 저장.
        }
        
        for(int i = 0; i < list.size(); i++) {
          int a = list.get(i);
          
          if((65 <= a) && (a <= 97)) {
            output += (char)(a + 32);
          } else if ((97 <= a) && (a <= 122)) {
            output += (char)(a - 32);
          } else {
            output += (char)a;
          }
        
        System.out.print("대문자로 변경 완료! : " + output + "\n");
        
        fw.write(output);     // 대문자로 변경하여 저장된 output 변수를 upper_test에 저장
        
        System.out.println("대문자로 변경하여 파일에 저장했습니다.");
        
      } catch (Exception e) {
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
