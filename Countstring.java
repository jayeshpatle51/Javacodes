import java.util.*;
public class Countstring{

public static void main(String[] args){
String str="aabbbccdaaaddd";

    //int curlength=1;
    char curchar;
    int count;
    //StringBuilder result=new StringBuilder();
    ArrayList<Character > list=new ArrayList<>();
    ArrayList<Integer > list2=new ArrayList<>();
    //Map<String, Integer> map=new HashMap<>();
    
    for(int i=0;i<str.length();i++) {
        String s2="";
        curchar=str.charAt(i);
        count=1;
        while(i<str.length()-1&&str.charAt(i+1)==curchar) {
            count++;
            i++;
        }
        
       // for(int j=1;j<=count;j++) {
      //      s2=s2+curchar;
      //  }
        list.add(curchar);
        list2.add(count);
    }
    for(int i=0;i<list.size();i++) {
       System.out.println(list.get(i)+ "-"+list2.get(i));
    }

}}