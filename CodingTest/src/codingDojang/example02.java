package codingDojang;

public class example02 {

	public static void main(String[] args) {
		String str = "aaa\taaa\taaaa";
		System.out.println(str);
		
		str =str.replaceAll("\t,","    ");
		System.out.println(str);
		
	}

}
