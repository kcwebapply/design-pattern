package learning.composite;

/**
 * Created by keiwada on 2018/03/23.
 */
public class Employee extends JobDataComponent{

	private String name;

	public  Employee(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void printThisBefore(){
		System.out.println("社員 " + this.name);
	}
}
