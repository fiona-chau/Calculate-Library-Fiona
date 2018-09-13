//this class contains the methods to do various math related tasks
// @ author: Fiona Chau
// @ version: 9/6
public class Calculate {
	//call to square returns square of value passed. Method accepts integer and returns an integer
	public static int square(int number){
	return number*number;	
	}
	//call to square returns cube of value passed. Method accepts integer and returns an integer
	public static int cube(int number) {
	return number*number*number;
	}
	// method accepts two doubles and returns a double
	public static double average(double number1, double number2) {
	return (number1+number2)/2;
	}
	//average method. accepts three doubles and returns a double
	public static double average(double number1, double number2, double number3) {
	return (number1+number2+number3)/3;
	}
	//call to toDegrees converts angle given in radians into degrees
	public static double toDegrees (double radians) {
	return radians*(180/3.14);
	}
	//call to discriminant accepts three doubles and returns a double
	public static double discriminant (double number1, double number2, double number3) {
	return (number2*number2)-(4*number1*number3);
	}
	//converts mixed number into improp fraction. accepts 3 integers and returns a string
	public static String toImproperFrac (double number1, double number2, double number3) {
	return ((number1*number3+number2)/"/"number3);
	}
	//converts 
	
}