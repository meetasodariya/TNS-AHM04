
public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {21,23,33,44,55};
		int[] arr2 = new int[12];
		String[] name = new String[4];
		name[0] = "Delhi";
		name[1] = "Ahmedabad";
		name[2] = "Bombay";
		name[3] = "Baroda";
		
		
		arr2[0]=32;
		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
		int sum1 = 0;
		for(int k:arr1) {
			sum1 += k;
			System.out.println(k);
		}
		
		for(String s:name) {
			System.out.println(s + " ");
		}
}
}
