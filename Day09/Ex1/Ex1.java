class Person{
	private String name;
	
	public String getName(){
		return name;
	}
	public  void setName(String newName){
		this.name=newName;
	}
}
class Main{
	public static void main(String[] args){
		Person p = new Person();
		p.setName("John");
		System.out.println(p.getName());
	}
}