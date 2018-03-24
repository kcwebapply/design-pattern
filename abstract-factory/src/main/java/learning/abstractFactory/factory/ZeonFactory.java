package learning.abstractFactory.factory;

import learning.abstractFactory.product.MobileSuit;
import learning.abstractFactory.product.Zaku;

/**
 * Created by keiwada on 2018/03/23.
 */
public class ZeonFactory implements MobileSuitFactory {

	@Override
	public MobileSuit makeMobileSuit() {
		return new Zaku();
	}
}
