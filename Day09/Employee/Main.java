class Employee{
	
	private String name;
	private double salary;
	
	public String getName(){
		return name;
	}
	public  void setName(String newName){
		this.name = newName;
	}
	public double getSalary(){
		return salary;
	}
	//public void setSalary(double newSalary)
		//this.salary = newSalary;
		
	// Constructor to set salary once
    public Employee(String newName, double newSalary) {
        this.name = newName;
        this.salary = newSalary;
    }	
	
}
public class Main{
	public static void main(String[] args){
		Employee e = new Employee("Alice",60000);
		
		e.setName("Alice");
		e.setSalary(70000);
		
		System.out.println("Name: "+ e.getName());
		System.out.println("Salary: "+ e.getSalary());
	}
}
	