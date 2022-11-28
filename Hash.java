import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class Hash{


public static void main(String[] args){

Map<String,String> map=new HashMap<>();
map.put("Jayesh","Gondia");
map.put("Rajkumar","Hyderabad");
map.put("kavita","Bangalore");
map.put("Srikar","Hyderabad");

System.out.println(map);
Set<Map.Entry<String,String>> set=map.entrySet();
for(Map.Entry<String,String> entry: set){
System.out.println(entry.getKey()+" "+ entry.getValue());
}

Iterator itr=map.entrySet().iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
Iterator<String> itr1=map.keySet().iterator();
while(itr1.hasNext()){
if(itr1.next().contains("s"))
System.out.println(itr1.next());
}


}}