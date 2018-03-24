package learning;

import learning.iterator.Customer;
import learning.iterator.Shop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration
public class IteratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(IteratorApplication.class, args);
		execute();
	}

	public static void execute(){
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(1,true));
		customerList.add(new Customer(2,true));
		customerList.add(new Customer(3,false));
		customerList.add(new Customer(4,true));
		customerList.add(new Customer(5,false));
		customerList.add(new Customer(6,true));

		Shop seiyu = new Shop(customerList);

		for (int i = 0; i< customerList.size()-1;i++){
			Customer customer = seiyu.getNextCustomer();
			if(customer != null){
				System.out.println("お客様"+customer.index+"番様をご対応します。");
			}else{
				System.out.println("お待ちのお客様がお帰りになられたので、スキップします。");
			}
		}

	}
}
