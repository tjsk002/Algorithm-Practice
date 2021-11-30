package JavaTest;

public class Main2 {
	public static void main(String[] args) {
		 int [] a = {5,3,9,1};
		    int j=0;
		    for(int i=0; i<=3; i++){
		      if(a[i] > a[j]){
		        int temp = a[j];
		        a[j] = a[i];
		        a[i] = temp;
		      }
		     }
		    
		    for(int i=0; i<=3; i++)
		      System.out.println(a[i]);
	}
}
