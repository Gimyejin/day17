package day17;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		/*
		ArrayList arr = new ArrayList();
		arr.add("test");
		arr.add(1111);
		arr.add(1.2222);
		arr.add('a');
		double s = arr.get(3)+1.11;
		*/
		//arr.get(3)에 저장되어있는 타입이 뭔지 모르니 에러(지금 중구난방으로 타입을 넣어놨음)
		//타입 상관없이 넣을 수 있어 편하겠지만 쓸 때는 힘들 것
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("string");//이제 문자열만 저장가능
		arr.get(0);
		
	}
}
