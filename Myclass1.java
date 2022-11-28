import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class Myclass1 {

public static void main(String [] args){

List<String> cities=new ArrayList<>();
cities.addAll(Arrays.asList("hyderabad","Bangalore","Pune","Mumbai","Nagpur"));

cities.add("Chennai");
System.out.println(cities);
cities.add(4,"Delhi");
System.out.println(cities);
cities.set(5,"lacknow");
cities.add("Chennai");
System.out.println(cities.size());

cities.forEach(System.out::println);
Set<String> set=new HashSet<>(cities);
System.out.println("Unique cities are");
set.forEach(System.out::println);







}

}