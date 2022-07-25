import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class Gettinguserinput{

public static void main(String[] args) throws IOException{
//getting input with BufferedReader class
BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
String name=reader.readLine();
System.out.println(name);

//getting input with Scanner class
Scanner sc=new Scanner(System.in);
String name1=sc.nextLine();
System.out.println(name1);

//getting input with console  method
String name2=System.console().readLine();
System.out.println(name2);


}
}