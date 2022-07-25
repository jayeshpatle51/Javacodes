import java.util.HashMap;
public class Retrievehashmap {

public static void main(String[] args){

  int arr[][]={{12,34,15},{23,56,43},{34,76,87}};
  
  HashMap<Integer,Integer> map=new HashMap<>();
  
  for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr[i].length;j++){
  
  map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
  }
  }
System.out.println(map);


}

}