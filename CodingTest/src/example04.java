import java.util.ArrayList;

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
		
		// 2번 이재영이라는 이름은 몇번 반복되나 
		int leejaeyoung = 0;
		
		for (int i = 0; i < nameList.length; i++) {
			if(nameList[i].equals("이재영"))
				leejaeyoung++;
		}
		System.out.println("이재영이라는 이름은 몇버 반복되나요 ? " + leejaeyoung);
		
		
		// 3번 중복을 제거한 이름을 출력하시오.
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (int i = 0; i < nameList.length; i++) {
			// 새로운 배열 리스트에 넣을 이름이 있는지 검사 후 없으면 더해준다
			if (!arrayList.contains(nameList[i])) 
				arrayList.add(nameList[i]);;
			}
			//배열 리스트에 정리 된 것을 다시 String 배열에 넣어두고 String 클래스 함수 사용
			String newArray[] = arrayList.toArray(new String[arrayList.size()]);
			
			System.out.println("중복을 제거한 이름");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i] + ((newArray.length == i +1)?"\n":", "));
		}
	}	
}
 