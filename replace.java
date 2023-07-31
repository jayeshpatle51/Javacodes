public class replace{

public int[] replaceDuplicate(int [] arr){
int dup=0;

for(int i=0;i<arr.length;i++){
boolean flag=false;
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
flag=true;

arr[j]=dup;

}
}
if(flag){
arr[i]=dup;
  }
}
return arr;
}
public static void main(String args[]){

 int[] arr={3,3,3,4,5,7,8,9,9,6,7};
for(int i:arr){
System.out.print(i+" ");
}
System.out.println();
replace r=new replace();
int [] arr1=r.replaceDuplicate(arr);

for(int j:arr){
System.out.print(j+" ");
}
}
}