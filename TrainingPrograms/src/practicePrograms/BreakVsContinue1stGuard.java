package practicePrograms;

public class BreakVsContinue1stGuard {

	public static void main(String[] args) {
		for(int n=0;n<7;n++)
		{
System.out.println("in loop"+n);{
	if(n==2) {
		continue;
	}
	System.out.println("            survived first guard");
	{
	if(n==4)	
	{
		break;
	}
		System.out.println("        survived second guard");
	}
	System.out.println("         end of loop or exit loop via loop");
	

}
}
}
}
