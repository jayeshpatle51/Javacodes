public class Matrix{

public boolean isMatrixEquals(int arr1[][],int arr2[][]){

int row1=arr1.length;
int row2=arr2.length;

int col1=arr1[0].length;
int col2=arr2[0].length;

if(row1!=row2 || col1!=col2){

return false;
}else{

for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr1[i].length;j++){
  if(arr1[i][j]!=arr2[i][j]){

    return false;
}
}
}
return true;
}

}

public static void main(String args[]){

int arr1[][]={{3,4,2},{4,5,3},{6,7,5}};
int arr2[][]={{3,4,2},{4,5,3},{6,7,5}};

Matrix m=new Matrix();
if(m.isMatrixEquals(arr1,arr2)){
System.out.println("Matrices are equal");
}else{
System.out.println("Matrices are not Equal");
}

}
}