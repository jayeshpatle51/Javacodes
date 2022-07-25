import java.util.*;

public class ArmstsrongNumber 
{  
 //num is equals to the sum of power of each digit of numbers. exa. no=153, no. of digits=3, then no==1^3 +5^3 +3^3=1+125+27=153;


public int power(int no, int pow) {
	int res=1;
	while(pow>0) {
		res=res*no;
		pow--;
	}
	return res;
}


public boolean isArmstrong(int n)   
{   
int sum=0;

int temp=n;
int digits=0;
int rem=1;
while(temp>0){
 temp=temp/10;
digits++;
}
temp=n;
while(temp>0){
rem=temp%10;
temp=temp/10;
int power=power(rem,digits);

sum=sum+power;

}


if(sum==n){
return true;
}
return false;
}   


public List<Integer> armstrongNos(int from, int upto){

System.out.println("The given armstrongnumber are:  ");
ArrayList<Integer> list=new ArrayList<>();
if(from<0 && upto<0){
System.out.println("range should be non negative");
}

for(int i=from;i<=upto;i++){
 boolean flag=isArmstrong(i); 
if(flag){
 list.add(i);
}
}
if(list.isEmpty()){
  System.out.println("armstrong nos are not present in given range");

}
  return list;
}



public static void main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: ");  

  
num=sc.nextInt();
int to=sc.nextInt();
  ArmstsrongNumber arm=new ArmstsrongNumber();

  List<Integer> list=arm.armstrongNos(num,to);

 for(Integer no: list){
System.out.print(no+" ");
}


}   
}  