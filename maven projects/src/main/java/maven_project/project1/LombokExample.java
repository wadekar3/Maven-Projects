package maven_project.project1;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//Lombok annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {
	private int id;
	private String name;
	private int age;
}

public class LombokExample {
	public static void main(String[] args) {

		Person person = new Person(1, "sai", 20);

		System.out.println(person);

//		person.setAge(21);
//		System.out.println("Updated age: " + person.getAge());
	}
}
