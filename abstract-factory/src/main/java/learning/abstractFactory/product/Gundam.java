package learning.abstractFactory.product;

/**
 * Created by keiwada on 2018/03/23.
 */

public class Gundam implements MobileSuit {
	@Override
	public void move() {
		System.out.println("ガンダムが起動しました。");
	}
}
