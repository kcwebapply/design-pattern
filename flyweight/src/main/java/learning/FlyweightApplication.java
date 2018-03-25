package learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyweightApplication.class, args);
		execute();
	}

	public static void execute(){
		Meibo meibo = new Meibo();
		System.out.println("100番idの方は"+meibo.returnName(100));
		System.out.println("100番idの方は"+meibo.returnName(100));
	}
}
