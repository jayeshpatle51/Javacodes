import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
//import java.util.Entry;
public class MyMap{

public static String reverseString(String str){
 String rev="";
for(int i=0;i<str.length();i++){
rev=str.charAt(i)+rev;
}
return rev;
}

public String MyMethod(String str){
  String rev= reverseString(str);
return rev;
}
public void countsum(int arr[]){

int count=0;
 for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
int sum=arr[i]+arr[j];

if(sum%2==0){
count++;
  System.out.println(arr[i]+"+"+arr[j]+" = "+ sum);
}
}

}
 
System.out.println("The count of sum of numbers which sum is even numbers is : "+ count);
}
public static void main(String args[]){


int num=10000;
System.out.println("The given sunny numbers upto "+num+" are : ");
for(int k=0;k<=num;k++){
 boolean cond =false;
for(int i=1;i<k;i++){
  if(i*i==k+1){
 cond=false;
   System.out.print(k+" ");
   break;
}

}

}

}
}