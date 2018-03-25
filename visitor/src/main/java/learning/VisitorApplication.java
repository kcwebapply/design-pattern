package learning;

import learning.visitor.AkushituKanyu;
import learning.visitor.Home;
import learning.visitor.Visitor;
import learning.visitor.YamatoUnyu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VisitorApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(VisitorApplication.class, args);
		execute();
	}

	public static void execute(){

		Visitor akusitu = new AkushituKanyu();
		Visitor yamato = new YamatoUnyu();

		Home kcHome = new Home();

		//AkushituKanyuクラスの中でVisitorメソッドが呼ばれ、ノックが実行される。
		kcHome.acceptVisitor(akusitu);
		//YamatoUnyuクラスの中でvisitorメソッドが呼ばれ、ベルを鳴らす処理が実行される。
		kcHome.acceptVisitor(yamato);

	}
}

