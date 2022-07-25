public class Search{

public static int binarySearch(int arr[],int no){

int start=0;
int end=arr.length-1;

while(start<end){
int mid=(start+end)/2;

if(arr[mid]==no){
return mid;
}else if(arr[mid]>no){
   end=mid-1;
}else {

start=mid+1;
}
}
return -1;
}
public static void main(String args[]){

Scanner scan =new Scanner(System.in);
System.out.println("Size of given Array is: ");
int n=scan.nextInt();

System.out.println("Enter the elements in array: ");
for(int i=0;i<n;i++){
  arr[i]=scan.nextInt();

}

}
}