package practicePrograms;

public class ReturnExample2 {

	static int computeSize(int height, int width) {
		//Return an expression based on two arguments (variables).
		return height *width;
	}
	public static void main(String[] args) {
		//Assign to the result of computeSize.
		int result=computeSize(10,3);
		System.out.println(result);

	}

}
