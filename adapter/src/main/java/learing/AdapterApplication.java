package learing;

import learing.adapter.InterfacePattern.Fisher;
import learing.adapter.InterfacePattern.Mameid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "learing.adapter")
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);
		execute();
	}


	private static void execute(){
		/*Fisher fisher = new Human();
		fisher.swim();
		コンパイルエラー。人間は泳げない。
		*/
		/* マーメイドは魚インタフェースを実装した人間クラス。マーメイドは泳ぐことも喋ることもできる。
		　　マーメイドはアダプタークラスで、魚インタフェースと人間クラスという型の関係上相容れない二つのクラスのやりとりを実現させている。
		*/
		Fisher fisher = new Mameid();
		fisher.swim();
	}

}
