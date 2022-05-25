package singletonPattern;

public class EagerInit {
	
	private static EagerInit instance = new EagerInit();
	
	private EagerInit() {
		System.out.println("Constructor");
	}
	
	public static EagerInit getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("EagerInit instance Hash:" + instance.hashCode());
	}
}
