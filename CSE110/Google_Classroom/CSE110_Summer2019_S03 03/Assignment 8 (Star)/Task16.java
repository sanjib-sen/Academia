import java.util.Scanner;
public class Task16{
    public static void main (String []args){
        Scanner sks = new Scanner(System.in);
        int inp=sks.nextInt();
        String space="";
        System.out.print("*");
        System.out.println();
        for(int i=1;i<inp-1;i++,space+=" "){
          System.out.print("*"+space+"*");
          System.out.println();
      }
        for(int p=1;p<=inp;p++){
        System.out.print("*");
        } 
        System.out.println();
    }
}