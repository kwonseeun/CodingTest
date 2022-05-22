public class example04 {

	public static void main(String[] args) {
		String name = " 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		
		String[] nameList = name.split(",");
		
		// 1번 김씨와 이씨는 각각 몇명인가 
		int kimCnt = 0, leeCnt = 0;
		
		for (int i = 0; i < nameList.length; i++) {
			if ( nameList[i].substring(0,1).equals("김")) 
				kimCnt++; 
			if( nameList[i].substring(0,1).equals("이"))
				leeCnt++;
	
		}
		System.out.println("김씨와 이씨는 각각 몇명일까요? " + kimCnt+ "," +leeCnt);
		
		// 2번째 이재영이라는 이름은 몇번 반복되나 
		int leejaeyoung = 0;
		
		for (int i = 0; i < nameList.length; i++) {
			if(nameList[i].equals("이재영"))
				leejaeyoung++;
		}
		System.out.println("이재영이라는 이름은 몇버 반복되나요 ? " + leejaeyoung);
	}
	
}
 