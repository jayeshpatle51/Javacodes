
import java.util.*;
public class IntegerList{
public ArrayList<Integer> commanElements(ArrayList<Integer> list1,ArrayList<Integer> list2){

list1.retainAll(list2);
return list1;
}
public ArrayList<Integer> listDifference(ArrayList<Integer> list1,ArrayList<Integer> list2){

list1.removeAll(list2);
return list1;
}


public static void main(String args[]){

ArrayList<Integer> list1=new ArrayList<>();
list1.add(3);
list1.add(5);
list1.add(6);
list1.add(9);

ArrayList<Integer> list2=new ArrayList<>();
list2.add(4);
list2.add(7);
list2.add(6);
list2.add(9);

IntegerList l=new IntegerList();
ArrayList<Integer> list3=new ArrayList<>();
list3=l.commanElements(list1,list2); 
System.out.println(list3);

list3=l.listDifference(list1,list2);
System.out.println(list3);
}
}