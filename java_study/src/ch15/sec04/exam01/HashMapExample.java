package ch15.sec04.exam01;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map<key의 타입, 저장할 값의 타입> 을 명시한다.
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size()); //map은 key값이 같은 데이터를 중복저장할 수 없다.
		
		//키로 값을 얻기
		String key = "신용권";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();
		
		//전체 데이터 출력하는 방법1
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next(); //키를 하나씩 가져온다.
			int v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		//전체 데이터 출력하는 방법2
		
	}

}
