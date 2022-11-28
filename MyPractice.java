public class MyPractice{

public static void main(String[] args){

 int score[]={10,23,30,9,54,2,60};
 
  /*score min max mincount maxcount
  10    10   10    0		0
  23    10   23    0    	1
  30	10	 30	   0		1
  9		9	 30	   1		0
  54	9	 54	   0		1
  2		2	 54	   1		0
  60    2	 60    0		1*/
  //return {mincount , maxcount};
  int min=score[0];
  int max=score[0];
  int minscorecount=0;
  int maxscorecount=0;
 for(int i=0;i<score.length;i++){
  
  if(score[i]<min){
   min=score[i];
   minscorecount++;
  }else if(score[i]>max){
  max=score[i];
  maxscorecount++;
  }else{
  continue;
  }
  
  }
  System.out.println(minscorecount+" "+maxscorecount);
  
 
}

}