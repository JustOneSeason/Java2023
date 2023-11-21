package ObjectTest;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		Key k1 = new Key(1);
		Key k2 = new Key(1);
		
		//System.out.println(k1.equals(k2));
		
		hashMap.put(k1, "HongGilDong");
		String value = hashMap.get(k2);
		System.out.println(value);
		
		
		
		//String obj1 = new String();
//		MyClass m = new MyClass();
//		
//		System.out.println(m.toString());//MyClass extends Object로 됨
		
//		Object obj1 = new MyClass(1234);
//		Object obj2 = new MyClass(1234);
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
	}

}
