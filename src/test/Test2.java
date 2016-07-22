package test;
/**
 *
 * @author veena
 *
 */

public class Test2 {
 int data[]={1,4,67};
 
	public void test2(){
		System.out.println("Data:");
		int sum=0;
		for(int i=0; i<data.length; i++){
			System.out.println("next value" + data[i]);
			 sum += i;
		}
		System.out.println("Sum is : " + sum);
	}

}
