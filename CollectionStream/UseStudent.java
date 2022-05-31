package CollectionStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("Kalai",40000,"Java");
		Student s2=new Student("Anish",25000,"C++");
		Student s3=new Student("Santhosh",38000,"Python");
		Student s4=new Student("Akash",45000,"Selineam");
		Student s5=new Student("Kumaran",30000,"CEA");
		ArrayList<Student>stu=new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		//List<Boolean>l=stu.stream().map(x->!x.getName().equals("Akash")).collect(Collectors.toList());
		//System.out.println(l);
		
//		List<Boolean>q=stu.stream().map(x->x.getName().equals("Akash")).collect(Collectors.toList());
	//	System.out.println(q);
		
//		List<String>p=stu.stream().map(x->x.getDegree().substring(0,2)).collect(Collectors.toList());
	//	System.out.println(p);
		
//		List<Integer>o=stu.stream().map(x->x.getName().length()).collect(Collectors.toList());
	//	System.out.println(o);
		
	//	List<Integer>v=stu.stream().map(x->x.getName().length()-1).collect(Collectors.toList());
//		System.out.println(v);
		
		//List<String>s=stu.stream().map(x->x.getName().toUpperCase()).collect(Collectors.toList());
	//	System.out.println(s);
		
	//	List<String>u=stu.stream().map(x->x.getName().toLowerCase()).collect(Collectors.toList());
	//	System.out.println(u);
		
	//	List<Boolean>w=stu.stream().map(x->x.getName().startsWith("A")).collect(Collectors.toList());
	//	System.out.println(w);
		
	//	List<Boolean>d=stu.stream().map(x->x.getName().endsWith("h")).collect(Collectors.toList());
//		System.out.println(d);
		
//		List<String>g=stu.stream().map(x->x.getName().concat("Kalai")).collect(Collectors.toList());
	//	System.out.println(g);
		
		List<Student>g=stu.stream().filter(x->x.getName().startsWith("A")&&x.getFees()>30000).collect(Collectors.toList());
		for(Student s:g) {
		System.out.println(s.getName());
		}
		g.forEach(y->System.out.println(y));
		
		List<String>f=stu.stream().filter(x->x.getDegree().startsWith("C")).map(y->y.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(f);
		
		long l=stu.stream().map(x->x.getName().toUpperCase()).count();
		System.out.println(l);
		
		long p=stu.stream().filter(y->y.getName().startsWith("A")).count();
		System.out.println(p);
	}

}
