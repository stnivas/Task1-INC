import java.util.Arrays;

class Segregate2 {

	public static void main(String[] args) {
		
		int myarraylist[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		System.out.println("Array Before Segregating : " +Arrays.toString(myarraylist));
		int my_value=0;
		for(int value=0; value<myarraylist.length;value++) {
			if(myarraylist[value]==0) {
				myarraylist[my_value++]=myarraylist[value];
			}
		}

		while(my_value<myarraylist.length) {
			myarraylist[my_value++]=1;
		}
		System.out.print("Array Before Segregating : ");
		for(int values=0;values<myarraylist.length;values++) {
			
			System.out.print(myarraylist[values]+  "  ");
		}
	}

}
