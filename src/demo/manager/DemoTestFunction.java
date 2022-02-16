package demo.manager;

public class DemoTestFunction {
	public static int playWithFive(int num) {
		if (num > 5) {
			return 5 * num;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(playWithFive(8));
	}
}
