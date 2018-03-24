package learning;

import learning.build.Creature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "learning.build")
public class BuildApplication {

	public static void main(String[] args) {

		SpringApplication.run(BuildApplication.class, args);
		execute();
	}

	private static void execute(){
		Creature dragon = new Creature.Builder().setName("破壊竜").setArmorName("竜の鎧").setSwordName("竜剣").build();
		Creature human = new Creature.Builder().setName("パンピーA").setArmorName("みかんの皮").setKakuseiPower(120).build();
	}
}
