package p0313.acb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import ScIf.Sc;


class Animal {
	int hp;
}

class Cat extends Animal{
	//int hp = 150;
	String name;
	Cat(String name) {
		this.name = name;
	}
}
class Comhp implements Comparator<Animal> {

	public int compare(Animal a2, Animal a1) {
		//a1hp = a1.hp; a2hp = a2.hp;
		return Integer.compare(a1.hp, a2.hp);
		//return ((Integer) a1.hp).compareTo((Integer) a2.hp);
	}
}


public class Sample_1 {

	public static void main(String[] args) {
		Cat[] catsArray = {};
		List<Cat> cats = new ArrayList<>(Arrays.asList(catsArray));
		cats.add(new Cat("a"));
		cats.add(new Cat("b"));
		cats.get(0).hp=100;
		cats.get(1).hp=200;
		
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		cat1.hp=100;
		cat2.hp=200;
		List<Cat> cats2 = new ArrayList<>();
		cats2.add(cat1);cats2.add(cat2);
		
		
		Comhp com = new Comhp();
		int i = com.compare(cats.get(0), cats.get(1));
		int i2 = com.compare(cat1, cat2);
		System.out.println(i+" "+i2);
		
	
		cats.sort(new Comhp());
		cats2.sort(new Comhp());
		/*Comparator<Cat> comCat = (Cat cat2, Cat cat1) -> {
			return ((Integer) cat1.hp).compareTo((Integer) cat2.hp);
		};
		Collections.sort(cats, comCat);
*/
		System.out.println(cats.get(0).hp);
		System.out.println(cats.get(1).hp);
		System.out.println(cats2.get(0).hp+" "+cats2.get(1).hp);
		
		Sc.nextInt();
	}

}
