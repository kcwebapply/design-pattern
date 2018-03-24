package learning.abstractFactory;

import learning.abstractFactory.factory.GundamGactory;
import learning.abstractFactory.factory.MobileSuitFactory;
import learning.abstractFactory.factory.ZeonFactory;
import learning.abstractFactory.product.MobileSuit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by keiwada on 2018/03/23.
 */
@Component
public class JavaExecutor implements CommandLineRunner{


	@Override
	public void run(String... strings) throws Exception {
		MobileSuitFactory factory = new ZeonFactory();
		MobileSuit zaku = factory.makeMobileSuit();
		zaku.move();

		MobileSuitFactory factory2 = new GundamGactory();
		MobileSuit gundam = factory2.makeMobileSuit();
		gundam.move();
	}
}
