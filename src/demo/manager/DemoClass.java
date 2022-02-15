package demo.manager;

public class DemoClass {
	private String name;
	private int age;
	
	public DemoClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void getInfo() {
		System.out.println(this.name + " is " + this.age + " years old");
	}
	
	public static void main(String[] args) {
		DemoClass demo = new DemoClass("Minh", 12);
		demo.getInfo();
	}
	
}
