import java.util.Scanner;
public class Task13{
    public static void main (String []args){
        Scanner sks = new Scanner(System.in);
        int inp=sks.nextInt();
        int p=1; int temp=inp;
        for(int i=1;i<=inp;i++,temp-=1,p+=2){
            for (int k=temp-1;k>0;k--){
                System.out.printf(" ");
            }
            for(int j=1;j<=p;j++){
                System.out.print(j);
            }
            System.out.println();
        }
       String space=" ";
        p-=4;
       for (int i=1;i<=inp-1;i++,space+=" ",p-=2){
          System.out.print(space);
       for (int j=p,s=1;j>0;j--,s++){
          System.out.print(s);
       }
       System.out.println();
      }
    }
}