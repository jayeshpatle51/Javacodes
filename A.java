public class A 
{ 
  void food()
  { 
     System.out.println("What kind of food do B eat?"); 
  } 
} 
public class B extends A
{ 
   void food(int x)
   { 
      System.out.println("B eats flesh"); 
   } 
 } 
public class Test extends B 
{ 
  public static void main(String[] args) 
  { 
    A a = new B(); 
      a.food();  // what is the out put here
	 // a.food(20); // what is the out put here

   B  = new B();  
    b.food();  // what is the out put here
    b.food(10);  // what is the out put here
  } 
}
