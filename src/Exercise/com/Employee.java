package Exercise.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String Name;
	Employee()
	{
		
	}
public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

public static void main(String[] args) {
	List<Employee> list1 = new ArrayList<>();
	list1.add(new Employee(100,"John1"));
	list1.add(new Employee(200,"John2"));
	list1.add(new Employee(300,"John3"));
	list1.add(new Employee(400,"John4"));

	List<Employee> list2 = new ArrayList<>();
	list2.add(new Employee(100,"John1"));
	list2.add(new Employee(200,"John2"));

	//Give only distinct values from two arrays 
List l=	list1.stream()
	 .filter(i->list1.contains(list2))
	 .collect(Collectors
	 .toList());
System.out.println(l);
}
}
