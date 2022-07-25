import java.util.HashMap;
import java.util.Arrays;

public class City{
 
public static void main(String[] args){

String arr[] ={"Gondia-1","Nagpur-1","Mumbai-1", "pune-1" ,"Hyderabad-2","bangalore-3",
"lakhnow-5","delhi-4","noida-5", "chandigarh-6"};
 

for(int i=0;i<arr.length;i++){
 
for(int j=i+1;j<arr.length;j++){
 if(arr[i].charAt(0)>arr[j].charAt(0)){
     
    String temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;

}

}

System.out.println(arr[i]);

}

"([^"])"

}

}