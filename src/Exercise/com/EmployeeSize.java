package Exercise.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeSize {
	int id;
	String Name;
	
public EmployeeSize(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}


@Override
public int hashCode() {
	return Objects.hash(Name, id);
}
//public int hashCode()
//{
//return 1;	
//}
////
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeSize other = (EmployeeSize) obj;
	return Objects.equals(Name, other.Name) && id == other.id;
}


public static void main(String[] args) {
	EmployeeSize e1=new EmployeeSize(1,"ram");
	EmployeeSize e2=new EmployeeSize(1,"ram");
	
	EmployeeSize e3=e1;
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	ArrayList<EmployeeSize> al=new ArrayList<>();
	al.add(e1);
	al.add(e2);
	System.out.println(al.size());
	HashSet s=new HashSet<>();
	s.add(e2);
	s.add(e1);
	System.out.println(s.size());
HashMap<EmployeeSize,Integer> hm=new HashMap<>();
hm.put(e1,1);
hm.put(e2, 2);
System.out.println(hm.size());

IdentityHashMap<EmployeeSize, Integer> i=new IdentityHashMap<>();
i.put(e1,1);
i.put(e2, 2);
System.out.println(i.size());
Map<String, String> m=new HashMap<>();
m.put("Sabha","Khan");
m.put("Sabha", "Khan");
System.out.println("size="+m.size());
System.out.println(1.0/0.0);
System.out.println(1/0);
}
}
