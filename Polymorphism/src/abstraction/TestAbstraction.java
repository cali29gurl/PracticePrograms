package abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		
		Device device1 = new Computer();
		
		Printer printer = new Printer();
		
		Device device2 = new Phone();
		
		System.out.println("Computer: ");
		device1.turnOn();
		device1.run();
		device1.turnOff();

		System.out.println("Printer: ");
		device1.turnOn();
		device1.run();
		device1.turnOff();

		System.out.println("Phone: ");
		device1.turnOn();
		device1.run();
		device1.turnOff();

	}

}
