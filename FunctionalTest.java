import java.util.*;
public class FunctionalTest{

public static void main(String[] args){

ArrayList<String> arr1=new ArrayList<>();

arr1.add("Jayesh");
arr1.add("Jitendra");
arr1.add("Sandhya");
arr1.add("Gayatri");
arr1.add("Meet");

ArrayList<String> arr2=new ArrayList<>();

arr2.add("Jayesh");
arr2.add("Jitendra");
arr2.add("Nepalchand");
arr2.add("pushpabai");
arr2.add("Sandhya");

for(String s: arr1){
System.out.print(s+" ");
}
System.out.println();
arr1.retainAll(arr2);
 
for(String s: arr1){
System.out.print(s+" ");
}
}

}