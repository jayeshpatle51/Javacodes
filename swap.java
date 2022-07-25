public class swap{

public static void main(String args[]){

int a=15;
int b=17;
System.out.println("The values of a and b before swapping: " +a+ " "+b);

a=a+b;
b=a-b;
a=a-b;



System.out.println("The values of a and b After swapping: " +  a+" "+ b);
}
}