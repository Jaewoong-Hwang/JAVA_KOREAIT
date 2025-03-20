package Ch32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	private String name;
	private int age;
	// 생성자(디폴트,모든인자)

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class C01StreamMain {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);

		// filter
		List<Integer> list2 = list.stream().filter((item) -> {
			return item % 2 == 0;
		}).collect(Collectors.toList());
		System.out.println("짝수 필터링 : " + list2);

		// map
//		List<Integer> list3 =
//		list.stream().filter((item)->{return item%2==0;})
//					.map(()->{})

		List<Person> list4 = Arrays.asList(
				new Person("홍길동동주", 55), 
				new Person("남길동네꼬미", 35), 
				new Person("서길동전주머니", 45),
				new Person("동길동동구리무-!", 25)

		);
		List<Integer> list5 = 
				list4.stream()
//				.map((person) -> {return person.getAge();})
//				.map((person) -> person.getAge())	// 위의 식에서 줄인거
				.map(Person::getAge)	//메서드 참조 (::)이용		//위에 식에서 최종으로 줄인 것
				.sorted((a,b)->{return b-a;}) //내림차순
				.collect(Collectors.toList());
		
		System.out.println(list5);

		list4.stream()
			.map((item)->{return null;})
			.collect(Collectors.toList());
	}
}
