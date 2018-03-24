package learning;

import learning.composite.Division;
import learning.composite.Employee;
import learning.composite.JobDataComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

@SpringBootApplication
public class CompositeApplication {

	public static void main(String[] args) {

		SpringApplication.run(CompositeApplication.class, args);
		execute();
	}

	public static void execute(){


		JobDataComponent sisutou = generateSisutemuToukatu();
		sisutou.print();
	}



	public static JobDataComponent generateSisutemuToukatu(){
		Division sisutou = new Division("システム統括本部");
		Employee kc = new Employee("kc部長");
		Division toire = new Division("トイレ部");

		sisutou.add(kc);
		kc.add(toire);

		return sisutou;
	}


}
