package programmers;

public class P_접미사인지_확인하기 {
	class Solution {
	    public int solution(String my_string, String is_suffix) {
	        if (!my_string.contains(is_suffix)) return 0;
	        return my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length()) ? 1 : 0;
	    }
	}
}
