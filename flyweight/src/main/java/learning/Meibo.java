package learning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by keiwada on 2018/03/25.
 */
public class Meibo {

	List<Customer> customerList = new ArrayList<>();

	public Meibo(){

	}

	public String returnName(int id){
		Customer customer = customerList.stream().filter(custom -> custom.id == id).findFirst().get();
		if(customer == null){
			customerList.add(new Customer(id,"kc"));
			return  null;
		}
		return customer.name;
	}
}
