package learning;

import learning.strategy.AgeComparator;
import learning.strategy.BmiComparator;
import learning.strategy.Comparator;
import learning.strategy.Human;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {

		SpringApplication.run(StrategyApplication.class, args);
		execute();
	}

	private static void execute(){

		Human kc = new Human("kc",173,71,24);

		Human wade = new Human("wade",193,92,30);
		
		Comparator ageComparator = new AgeComparator();
		int res = ageComparator.compare(kc,wade);
		if(res > 0){
			System.out.println("kcの方が高齢だ");
		}else{
			System.out.println("wadeの方が高齢だ");
		}

		Comparator bmiComparator = new BmiComparator();
		int res2 = bmiComparator.compare(kc,wade);
		if(res2 > 0){
			System.out.println("kcの方が高BMIだ");
		}else{
			System.out.println("wadeの方が高BMIだ");
		}

	}
}
