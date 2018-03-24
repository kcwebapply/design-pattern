package learning.iterator;

import java.util.List;

/**
 * Created by keiwada on 2018/03/24.
 */
public class Shop {

	public Iterator iterator;

	public List<Customer> customerList;

	public Shop(List<Customer> customerList){
		this.customerList = customerList;
		this.iterator = new CustomerIterator(customerList);
	}

	public Customer getNextCustomer(){
		return (iterator.hasNext())?iterator.getNextCustomer():null;
	}


}
