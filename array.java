
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {21,21,86,74,55};
		int max = arr1[0];
		for(int i:arr1) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("Maximum Number is: "+ max);
	}

}
