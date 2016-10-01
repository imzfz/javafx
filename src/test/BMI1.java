package test;

public class BMI1{
	private String name;
	private int age;
	private double weight;
	private double height;

	public BMI1(){

	}
	public BMI1(String name,int age,double weight,double height){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public BMI1(double weight,double height){
		this.weight = weight;
		this.height = height;
	}
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getBMI(){
		return weight/Math.pow(height, 2);
	}

	public String getStatus(){
		if(getBMI()<18.5)
			return "低重";
		else if(getBMI()>=18.5 && getBMI()<25)
			return "正常";
		else if(getBMI()<=25 &&getBMI()<30)
			return "超重";
		else
			return "肥胖";
	}
}

//class Test{
//	public static void main(String[] args){
//	BMI1 bmi = new BMI1("小明",18,60,1.7);
//	System.out.println("姓名" + bmi.getName() + "年龄" + bmi.getAge() + "\n" + "体重指数" + bmi.getBMI() + "\n" + "体重状况" + bmi.getStatus());
//	}
//}

