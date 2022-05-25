package singletonPattern;

public class SingleTonTest {

	public static void main(String[] args) {
		EagerInit ei = EagerInit.getInstance();
		ei.print();
		
		EagerInit ei2 = EagerInit.getInstance();
		ei2.print();
	}

}
