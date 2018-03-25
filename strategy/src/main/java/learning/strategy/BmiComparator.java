package learning.strategy;

/**
 * Created by keiwada on 2018/03/25.
 */
public class BmiComparator implements Comparator {

	@Override
	public int compare(Human h1, Human h2) {
		return (bmiGenerator(h1)>bmiGenerator(h2))?1:-1;
	}

	private double bmiGenerator(Human human){
		return human.weight + Math.pow(human.height,2);
	}
}
