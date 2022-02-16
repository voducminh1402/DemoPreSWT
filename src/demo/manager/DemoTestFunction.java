package demo.manager;

public class DemoTestFunction {
	public static int playWithFive(int num) {
		int flag = 0;
		if (num > 5) {
			flag = 5 * num;
		}
		return "a";
	}
	
	public static void main(String[] args) {
		playWithFive(8);
	}
}
