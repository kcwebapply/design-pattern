package learning.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by keiwada on 2018/03/23.
 */
public abstract class JobDataComponent {

	public List<JobDataComponent> componentsList = new ArrayList<>();

	public void add(JobDataComponent component){
		componentsList.add(component);
	}

	public void execute(){
		componentsList.stream().forEach(component -> {
			System.out.println(component);
		});

	}

	protected void printThisBefore() {}



	public void print(){
		printThisBefore();
		System.out.println(" ");
		componentsList.stream().forEach(component ->
			component.print());

	}








}
