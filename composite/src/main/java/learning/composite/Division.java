package learning.composite;

/**
 * Created by keiwada on 2018/03/23.
 */
public class Division extends JobDataComponent{

	private String name;

	public Division(String name){this.name = name;}

	public String getName(){
		return this.name;
	}

	public void printThisBefore(){
		System.out.println("部署 "+this.name);
	}
}
