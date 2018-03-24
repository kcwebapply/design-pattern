package learning.iterator;

import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

/**
 * Created by keiwada on 2018/03/24.
 */
public class CustomerIterator implements Iterator {


	private List<Customer> customers;

	public int index;

	private Customer newCustomer;

	public CustomerIterator(List<Customer> customers){
		this.customers = customers;
	}


	@Override
	public boolean hasNext() {
		Optional<Customer> nextCustomer = customers.stream().filter(customer -> customer.index > index).filter(customer -> customer.waiting).findFirst();
		if(ObjectUtils.isEmpty(nextCustomer.get())){
			System.out.println("現在待機中のお客様はおりません。");
			return false;
		}

		this.newCustomer = nextCustomer.get();
		return true;
	}

	//適当に作っちゃった
	@Override
	public Customer getNextCustomer(){
		this.index = newCustomer.index;
		return newCustomer;
	}


}
