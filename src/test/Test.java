package test;

public class Test {

	public static void main(String[] args){
		Person p1 = new Person("张三","北京","111","ab@126.com");
		Employee p2 = new Employee("王五","上海","222","cd@126.com","二教",6000);
		Faculty p3 = new Faculty("赵六","上海","333","ef@126.com","二教",5000,"9",3);
		System.out.println(p1.toString() +"\n" + p2.toString() + "\n" + p3.toString());
	}
}

class Person{
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person(){

	}
	public Person(String name, String address,String phone,String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String toString(){
		return "姓名" + name + "\n" + "地址" + address + "\n" + "电话号码" + phone + "\n" + "电子邮件" + email + "\n";
	}
}

class Employee extends Person{
	private String office;
	private double salary;

	public Employee(){

	}
	public Employee(String name, String address,String phone,String email,String office,double salary){
		super(name,address,phone,email);
		this.office = office;
		this.salary = salary;
	}
	public String toString(){
		return super.toString() + "办公室" + office +"\n" + "工资" + salary +"\n";
	}
}

class Faculty extends Employee{
	public final int TEACHING_ASSISTANT = 1;
	public final int LECTURER = 2;
	public final int ASSOCIATE_PROFESSOR = 3;
	public final int PROFESSOR = 4;
	private String workingDayAndTime;
	private int title;

	public Faculty(){

	}
	public Faculty(String name, String address,String phone,String email,String office,double salary,String workDayAndTime,int title){
		super(name,address,phone,email,office,salary);
		this.title = title;
		this.workingDayAndTime = workDayAndTime;
	}
	public String toString(){
		return super.toString() + "办公时间" + workingDayAndTime + "点\n" + "职称" + title +"\n";
	}
}
