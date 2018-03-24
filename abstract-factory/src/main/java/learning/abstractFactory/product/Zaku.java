package learning.abstractFactory.product;


/**
 * Created by keiwada on 2018/03/23.
 */
public class Zaku implements MobileSuit {

	@Override
	public void move() {
		System.out.println("ザクが起動しました。");
	}
}
