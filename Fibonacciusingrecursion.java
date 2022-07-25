public class Fibonacciusingrecursion{

public int fibonacci(int n){

if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacci(n-2) + fibonacci(n-1);

}

public static void main(String args[]){

Fibonacciusingrecursion f=new Fibonacciusingrecursion();
int max=10;
for(int i=0;i<max;i++){
   int n=f.fibonacci(i);
System.out.println(n);
}


}
}