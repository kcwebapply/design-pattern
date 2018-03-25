package learning;

import learning.bridge.Human;
import learning.bridge.NewHuman;
import learning.bridge.President;
import learning.bridge.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Handler;

@SpringBootApplication
public class BridgeApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(BridgeApplication.class, args);
		execute();
	}

	public static void execute(){
		Human student = new Student();
		Human president = new President();

		/**
		 * ここから新人類NewHumanのflyメソッドをstudentとpresidentインスタンスに持たせるには、新たにNewHumanを継承したStudentクラスとPresidentクラスを作らなければならない。
		 * しかし、機能追加用(flyなどのメソッド追加用)のHumanBridgeクラスと、実装用抽象クラスのHumanクラスに分けることで、
		 */


		NewHuman newHuman = new NewHuman(student);
		newHuman.humanEat();
		newHuman.fly();

		NewHuman newPresident = new NewHuman(president);
		newPresident.humanEat();

	}
}
