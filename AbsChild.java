import java.util.*;

abstract class SampleAbstract{

String u="suresh", p="12345";

public void time(){
Calendar c = Calendar.getInstance();
System.out.println(c.getTime());
}

public abstract void transaction();
}


public class AbsChild extends SampleAbstract{

String us, pwd;
public void transaction(){
Scanner sc = new Scanner(System.in);
do{
System.out.println("enter username and password");
us=sc.nextLine();
pwd=sc.nextLine();

if(us.equals(u) &&pwd.equals(p)){
System.out.println("login success");
}
else{
System.out.println("incorrect username or password ");
}
} while(!(us.equals(u) && pwd.equals(p)));
}

public static void main(String[] args){
AbsChild  obj= new AbsChild();
obj.time();
obj.transaction(); 
}
}