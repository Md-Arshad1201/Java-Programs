import java.lang.System;
import java.util.Scanner;
public class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter an Integer:");
int n=sc.nextInt();
System.out.print("Prime Numbers=");
for(int i=2;i<=n;i++){
int fact=0;
for(int j=1;j<=i;j++){
if(i%j==0){
fact++;
}
}
if(fact==2){
System.out.print(i+" ");
}
}
}
}