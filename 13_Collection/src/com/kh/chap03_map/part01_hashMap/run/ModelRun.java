package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class ModelRun {

	public static void main(String[] args) {
		HashMap<String,Snack> hm= new HashMap();
		
		//1.put(K key,V value): Map공간에 key+value 형태 추가
		hm.put("눈을감자", new Snack("짠 맛",1500));
		hm.put("맛동산",new Snack("단 맛",3000));
		hm.put("오사쯔",new Snack("고구마맛",2000));
		
		System.out.println(hm);
		System.out.println(hm);
		//키값은 중복허용x 같은 키값으로 다른 밸류 넣으면 기존에 덮어씌워짐
		
		hm.put("오징어땅콩", new Snack("짠 맛",1500));
		System.out.println(hm);
		//value값 중복 허용
		//key는 식별자의 역할. key로 value찾는다.
		
		//2.get(Object key): 해당 키값에 해당하는 밸류값을 반환하는 ㅁㅅㄷ
		System.out.println(hm.get("맛동산"));
//		System.out.println(hm.get("홈런볼"));//null 반환
		
		//3.size(): 담겨 있는 개수 반환
		System.out.println(hm.size());
		
		//4.replace(K key,V value): 해당 키값을 찾아서 밸류값 변경
		hm.replace("오징어땅콩", new Snack("매운맛",5000));
		hm.replace("홈런볼", new Snack("티라미수맛",4000));
		
		//replace는 기존에 없는 키값을 변경하려고 하면 추가x 변경 x
		System.out.println(hm);
		
		//5.remove(Object key): 해당 키값을 찾아서 키+밸류 세트로 지워주는 ㅁㅅㄷ
		hm.remove("오징어 땅콩");
		System.out.println(hm);
		
		System.out.println("==================");
		//해시맵에 있는 요소들을 순차적으로 접근하고자 한다면?
		//for문 / 향상된 for문 전부 사용불가
		//iterator를 사용해서 돌려준다
		//Map을 set으로 변경해서 작업
		
		//1.KeySet()이용
		//Map제공 메소드로 set에 Map에 있는 key들만 담아준다.
		//반환형은 Set
		
		//1단계 - key를 Set에 담기
		Set<String> keySet=hm.keySet();
		
		System.out.println(keySet);
		//for문으로 출력해보기
		for(String s: keySet) {
			System.out.println(s);
		}
		//Iterator로 출력해보기
		//keySet에 뽑아둔 키값들로 iterator메소드 이용해 Iterator에 담기
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//키를 이용해서 밸류 뽑기
			String key=it.next();
			Snack value= hm.get(key);
			System.out.println("key: "+key+"valaue: "+value);
		}
		
		System.out.println("=======entrySet=======");
		
		//2.entrySet을 이용하는 방법
		//1)Map에 있는 key+value 세트를 Entry라는 형식으로 Set에 담는 방법
		Set<Entry<String,Snack>> entrySet= hm.entrySet();
		
		
		//향상된 for문으로 출력
		for(Entry e: entrySet) {
			System.out.println("key값은: "+e.getKey()
			+" value값은 "+e.getValue());
		}
		
		//iterator로 출력
		//iterator에 옮겨 담고 반복문을 이용하기 
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		
		while(itEntry.hasNext()) {
			System.out.println(itEntry.next());
		}
		/*
		 * Map계열 특성상 순차적으로 접근할 직접적인 방법이 없기 때문에
		 * Set계열로 바꿔서 접근해야한다. keySet()과 EntrySet()을 이용해서 진행.
		 * 
		 *  
		 */
	}

}















































