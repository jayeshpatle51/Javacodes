import java.util.Scanner;
public class Assertions{

boolean approve(int age){
if(age>18){
return true;
}else{
return false;
}
}
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
Assertions ass=new Assertions();

int n=scan.nextInt();
//int n=12;
boolean b=ass.approve(n);
System.out.println(b);
assert(b):"Invalid age";

System.out.println(n);

}
}