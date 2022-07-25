import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
public class Jayeshpatel{


public static void main(String[] args){

ArrayList<String> list1=new ArrayList<>();
list1.add("Jayesh-1");
list1.add("Jitendra-2");
list1.add("Sandhya-3");
list1.add("Chovyam");

System.out.println("Before Sorting List: " + list1);
for(int i=0;i<list1.size();i++){
for(int j=i+1;j<list1.size()-1;j++){
if(list1.get(i).charAt(0)>list1.get(j).charAt(0)){
           String str=list1.get(i);
         list1.set(i,list1.get(j));
         list1.set(j,str);
}

}
}

System.out.println("After Sorting List: " + list1);

}
}