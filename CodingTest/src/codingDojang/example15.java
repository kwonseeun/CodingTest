package codingDojang;

import java.util.ArrayList;

public class example15 {

	public static void main(String[] args) {	
		String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌" ;
			
		
		String[] array = input.split(",");
		
		int kimCnt =0;
		int leeCnt =0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i].substring(0, 1).equals("김"))
				kimCnt++;
			if(array[i].substring(0, 1).equals("이"))
				leeCnt++;
		}
		System.out.println("김 씨는 " + kimCnt + "명 " + "이 씨는"+leeCnt+"명 입니다.");
		
		
		// 이재영 이라는 사람은 몇번 반복되는지 
		
		int leejaeyoung = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i].equals("이재영"))
				leejaeyoung++;
		}
		System.out.println("이재영 은 "+leejaeyoung + " 명 입니다 ");
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		//배열 리스트에넣을 이름이 있는지 검사 후 없으면 더해준다. 
		for (int i = 0; i < array.length; i++) {
			if(!arrList.contains(array[i]) )
				arrList.add(array[i]);
		} // 배열리스트에 정리 된 것을 다시 string배열에 넣어두고 string함수 사용 
		String newArray[] = arrList.toArray(new String[arrList.size()]);
		
		System.out.println("중복을 제거한 이름: ");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + ((newArray.length == i + 1?"\n":",")));
		}
	}
}
