public class Array{

public int largestno(int arr[]){
int temp=0;
for(int i=0;i<arr.length;i++){

for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
return temp;

}
public static void main(String []args){

int arr[]={2,4,6,3,5,7};

Array large=new Array();
int max=large.largestno(arr);
System.out.println(max);
}

}