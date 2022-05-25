package singletonPattern;

public class StaticBlock {
	private static StaticBlock instance;
	
	private StaticBlock() {
		System.out.println("Constructor");
	}
	
	static {
		try {
			instance = new StaticBlock();
		} catch (Exception e) {
				throw new RuntimeException("Exception in creating singleton instance");
		}
	}
	public static StaticBlock getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("StaticBlock instance Hash:" + instance.hashCode());
	}
}
