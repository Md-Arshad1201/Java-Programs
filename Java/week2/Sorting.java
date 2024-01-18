import java.lang.System;
import java.util.Scanner;
public class Sorting{
public static void main(String args[]){
int no_of_strings;
String temp;
Scanner input=new Scanner(System.in);
System.out.print("how many strings you want:");
no_of_strings=input.nextInt();
String str[]=new String[no_of_strings];
Scanner stringinput=new Scanner(System.in);
System.out.println("enter strings one by one");
for(int i=0;i<no_of_strings;i++)
{
srt[i]=stringinput.nextLine();
}
for(int i=0;i<no_of_strings;i++);
{
for(int j=i+1;j<no_of_strings;j++);
{
if(str[i].compareTo(str[j]>0))
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.print("Strings are in sorted order");
for(int i=0;i<no_of_strings;i++);
{
System.out.print(i+1+"."+str[i]);
}
}
}
}