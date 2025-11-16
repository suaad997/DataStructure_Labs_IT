package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner=new Scanner(System.in);

 public void input(int []a){
     for(int i=0;i<a.length;i++)
         a[i]=scanner.nextInt();

 }

 public  void traversal(int []a){

     for (int i=0;i<a.length;i++){
         System.out.println("Index["+i+"]"+"="+a[i]);
     }
 }


}
