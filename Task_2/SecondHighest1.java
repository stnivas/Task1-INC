import java.util.Scanner;

public class SecondHighest1 {

	public static void main(String[] args) {
		int number;
		int MAX;

		Scanner input=new Scanner (System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		int myarray[]=new int[number];
		System.out.println("Enter the array element: ");
		for (int i=0;i<number;i++)
			myarray[i]=input.nextInt();

			for(int i=0;i<number;i++)
			{
				for(int j=i+1;j<number;j++) {
					if(myarray[i]>myarray[j]) {
						MAX =myarray[i];
						myarray[i]=myarray[j];
						myarray[j]=MAX;
						
					}
				}
		}
System.out.println("Second Largest element in given array : "+ myarray[number-2]) ;
	}

}
