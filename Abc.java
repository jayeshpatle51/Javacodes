public class Abc{

public static void main(String args[]){


String str="aabbaaacccddmmm";

for(int i=0;i<str.length();){
   //boolean flag=true;
  char curchar=str.charAt(i);
int count=0;
int index=0;
int j;
for( j=i;j<str.length();j++){
if(curchar!=str.charAt(j)){   
   break;
}else{
 count++;
 
}
}
System.out.println(curchar+"="+count);
i=j;
}

}
}