package practicePrograms;

public class CheckMonkeysSmiling {

	public static void main(String[] args) {
		// Check if 2 monkeys a and b are smiling
		// if both smiling return, true
		// else neither smiling return true
		// if one is smiling return false
		System.out.println("Are we in trouble: " + 
		checkIfMonkeysSmiling(true, false));

	}

	static boolean checkIfMonkeysSmiling(boolean monkey1smile, boolean monkey2smile) {
		{

			if (monkey1smile == monkey2smile) {
				return true;
			} else {
				return false;
			}

		}
	}
}
