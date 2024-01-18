import java.lang.System;
import java.util.Scanner;
public class Palindrome{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("Enter String: ");
String str=input.nextLine();
int len=str.length();
String rev="";
for(int i=len-1;i>=0;i--){
rev=rev+str.charAt(i);
}
if(str.equals(rev)){
System.out.print(str+" is a palindrome");
}
else{
System.out.print(str+" is not Palindrome");
}
}
}
