import java.util.Set;
import java.util.HashSet;

public class DuplicateValue{

public static void main(String[] args){

int[] arr={3,4,5,6,5,4,9,8,7};

Set<Integer> set=new HashSet<>();

for(int i=0;i<arr.length;i++){

if(!set.add(arr[i])){
System.out.print(arr[i]+" ");
}
}


}
}