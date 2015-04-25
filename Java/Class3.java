package javaapplication6;
import java.util.ArrayList;
import java.util.Scanner;
public class JavaApplicantion6 {
public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    ArrayList<String> array=new ArrayList<>();
  try {
    java.net.URL url = new java.net.URL("http://www.xmu.edu.cn/");
    int count = 0;
    int current = 0,endIndex;
    Scanner input = new Scanner(url.openStream());
    while (input.hasNext()) {
        String line = input.nextLine();
        if(line.equals("            <ul class=\"link panel\">"))
            break;
    }
    while (input.hasNext()) {
    String line = input.nextLine();
    if(line.equals("            </ul>"))
            break;
    current=line.indexOf("http://",current);
      while (current>0){
          endIndex=line.indexOf("\" ",current);
          if (endIndex>0){
            list.add(line.substring(current,endIndex));
            count++;
            current=line.indexOf("</i>",current);
            endIndex=line.indexOf("</a>",current);
            array.add(line.substring(current +4,endIndex));
            System.out.print("【"+count+"】");System.out.print(array.get(count-1));System.out.println(list.get(count-1));
        }
        current=-1;
      }
}
}catch(Exception ex){
        System.out.println("Error"+ex.getMessage());
        }
}
} 
