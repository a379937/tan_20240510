package p0321;

import java.util.HashMap;
import java.util.Map;

class Human{
	int i;
}

class Student extends Human{
	Student(){
		i = 2;
	}
	public String toString() {
		Integer i2 = i;
		return i2.toString();
	}
	
}
class Teacher extends Human{
	Teacher(){
		i = 3;
	}
}
public class Sample_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student s = new Student();
		Teacher t = new Teacher();

		
		Map<Integer,Human> m = new HashMap<>();
		m.put(s.i, s);
		System.out.println(m.values());
		
		Map<Object,Object> m2 = new HashMap<>();
		m2.put(s.getClass(), s);
		System.out.println(m2.containsKey(new Student().getClass()));
		System.out.println(m2.keySet());
		
		
	}

}
