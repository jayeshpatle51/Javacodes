public class MultiplicationTable{

public void multipleTable(int n){
for(int i=1;i<=10;i++){
 int multiple=n*i;
System.out.println(multiple);
}
}
public static void main(String args[]){

MultiplicationTable multi=new MultiplicationTable();
multi.multipleTable(11);

}
}