package learning.strategy;

/**
 * Created by keiwada on 2018/03/25.
 */
public class AgeComparator implements Comparator{

	@Override
	public int compare(Human h1, Human h2) {
		return (h1.age > h2.age)?1:-1;
	}
}
