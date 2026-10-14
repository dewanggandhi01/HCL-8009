package Lambda;

////Use of the Interface and implements usage 
//interface MessagePrinter {
//    void printMessage(String msg);
//}
//
//class StudentPrinter implements MessagePrinter {
//    @Override
//    public void printMessage(String msg) {
//        System.out.println("Student Notification: " + msg);
//    }
//}
//
//public class InterfaceUse {
//    public static void main(String[] args) {
//        MessagePrinter printer = new StudentPrinter();
//        
//        printer.printMessage("Welcome to the HCL training session!");
//    }
//}

interface Calculator{
	int calculate(int a, int b);
}

interface CheckInteger{
	boolean test(int a);
}
public class InterfaceUse{
	public static void main(String[] args) {
		Calculator add = (a,b) -> a+b;
		Calculator subtract = (a,b) -> a-b;
		Calculator multiply = (a,b) -> a*b;
		Calculator division = (a,b) -> a/b;
		Calculator modulo =(a,b) -> a%b;
		CheckInteger isEven = (a) -> {
			if(a%2==0) return true;
			else return false;
		};
		CheckInteger isOdd = (a) -> {
			if(a%2!=0) return true;
			else return false;
		};
		int num1 = 20;
        int num2 = 10;

        System.out.println("Addition:" + add.calculate(num1, num2));
        System.out.println("Subtraction:" + subtract.calculate(num1, num2));
        System.out.println("Multiplication:" + multiply.calculate(num1, num2));
        System.out.println("Division:" + division.calculate(num1, num2));
        System.out.println("Modulo:" + modulo.calculate(num1, num2));
        System.out.println("Check even:" + isEven.test(num1));
        System.out.println("Check odd:" + isOdd.test(num1));
	}
}