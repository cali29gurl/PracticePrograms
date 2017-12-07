package inheritance;

public class InheritanceProgramMain {

	public static void main(String[] args) {
		
Developer dev1 = new Developer();

dev1.pay();
dev1.bonus();
dev1.fourOoneK();

Salesperson salesperson1 = new Salesperson();

salesperson1.pay();
salesperson1.bonus();
salesperson1.four0oneK();
salesperson1.profitSharing();

Clerk clerk1= new Clerk();
clerk1.pay();
clerk1.bonus();
	}

}
