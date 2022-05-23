package codingDojang;

public class example07 {

	public static void main(String[] args) {
		int min = 0; //3이 나오는 분이 몇분인지 카운트 
		
		for (int h = 0; h < 24; h++) { 
			if (h == 3 || h == 13 || h == 23) { // 시간부터 3이 있다면 
				min += 60;
				continue;
			} else 
				for(int m_10 = 0; m_10 < 6; m_10++) {
					if(m_10 == 3) {
						min+= 10;
						continue;
					} else min ++;
				}
			}
		System.out.println(min*60);
	}

}
