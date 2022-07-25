import java.util.ArrayList;
import java.util.Iterator;
public class Collectionsclass{

public static void main(String[] args){

ArrayList<String> arr=new ArrayList<>();
arr.add("My");
arr.add("Name");
arr.add("Jayesh");
arr.add("Patle");
arr.add("Gondia");
arr.add("Maharashtra");

//There are 4 ways to print this list
//1)using for loop 
//2)using iterator
//3)using enhanced for loop 
//4)by printing reference

System.out.println(arr);
for(int i=0;i<arr.size();i++){
  System.out.println(arr.get(i));

}
for(String st:arr){
System.out.println(st);
}

Iterator<String> itr=arr.iterator();
while(itr.hasNext()){

System.out.println(itr.next());
}

}
}