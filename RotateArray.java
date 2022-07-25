public class RotateArray{

public int[] rotateArray(int[] arr,int dist){

if(dist>=arr.length) {
	System.out.println("no of Rotation should not equal or greater than array Size");
}else {
int[] arr1=new int[arr.length];
int i;
int temp=dist;
for( i=0;i<arr.length;i++){
if(temp<arr.length){
   arr1[temp]=arr[i];
temp++;
}else{
break;
}
}
int k=i;
for(int j=0;j<dist;j++){
arr1[j]=arr[k];
k++;
}

return arr1;
}
return arr;
}

public static void main(String[] args){
int [] arr={1,2,3,4,5};
System.out.println("Before rotating array : ");
		for(int j:arr) {
			System.out.print(j+" ");
		}
System.out.println();
RotateArray r=new RotateArray();
  int[] arr2=r.rotateArray(arr,3);
System.out.println("After rotating array : ");
for(int i:arr2){
System.out.print(i+" ");
}
}
}