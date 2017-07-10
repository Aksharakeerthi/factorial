# factorial
import java.io.*;
import java.util.*;
public class factorial{
public static void main(String args[]){
int m,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
m=sc.nextInt();
for(int i=1;i<=m;i++){
fact=fact*i;
}
System.out.println("The factorial number is:"+fact);\}
}
