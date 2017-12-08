
public class Unlucky13 {

	public static void main(String[] args) {
		// sudo code
		// create a dummy array to test {1,2,3,13,4}
		// create a sum variable int sum=0;
		// for(each numbe:array)}
		// sum=sum+number;
		// if end}
		// else{
		// break;}
		// for end}
		
		int[] numbers = {1,2,3,13,4};
		System.out.println(sum13(numbers));

	}

	public static int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				break;
			} else {
				sum += nums[i];
			}
		}
		return sum;
	}
}