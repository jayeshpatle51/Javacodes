public class LargestnoInArray{

public int largestno(int[] arr){

int max=arr[0];
for(int i=0;i<arr.length;i++){
 
if(arr[i]>max){

max=arr[i];

}
}
return max;

}

public static void main(String args[]){

int arr[]={2,3,5,9,7};
int n=arr.length;,
LargestnoInArray large=new LargestnoInArray();


int max=large.largestno(arr);

System.out.println("largest in array :" +max);


}}