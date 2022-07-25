abstract class School{

School(){
System.out.println("This is a school");
}
public void cbscSchool(){
  
System.out.println("This is cbscSchool");
}
abstract void stateSchool();

}
class IndianSchools extends School{
 void stateSchool(){
System.out.println("This is Telangana State School");
}
}
public class Abstractclass{

public static void main(String args[]){
 
 IndianSchools in=new IndianSchools();

 int n=9/0;
System.out.println(n);

}
}