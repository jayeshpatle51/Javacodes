import java.util.Arrays;
public class Anagram{

public boolean isAnagram(String str1,String str2){

if(str1.length()!=str2.length()){

return false;
}
char[] arr1=str1.toCharArray();
char[] arr2=str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
boolean b=Arrays.equals(arr1,arr2);
return b;

}

public static void main(String[] args){

String str1="p,90 atel";
String str2="pa t,09le";

Anagram ana=new Anagram();

boolean value=ana.isAnagram(str1,str2);
if(value){
System.out.println("The given Strings are Anagram");

}else{
System.out.println("The given Strings are not Anagram");

}


}

}