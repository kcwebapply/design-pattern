package learning.abstractFactory.factory;

import learning.abstractFactory.product.Gundam;
import learning.abstractFactory.product.MobileSuit;

/**
 * Created by keiwada on 2018/03/23.
 */
public class GundamGactory implements MobileSuitFactory {
	@Override
	public MobileSuit makeMobileSuit() {
		return new Gundam();
	}
}
