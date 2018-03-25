package learning.bridge;

import java.util.HashMap;

/**
 * Created by keiwada on 2018/03/25.
 */
public class President extends Human {

	@Override
	public void eat() {
		System.out.println("eat():ビーフシチューをいただく");
		brag();
	}

	public void brag(){
		System.out.println("brag():これ美味しそうだろお？");
	}
}
