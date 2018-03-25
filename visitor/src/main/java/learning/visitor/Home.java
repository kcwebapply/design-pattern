package learning.visitor;

/**
 * Created by keiwada on 2018/03/25.
 */
public class Home {

	Visitor visitor;

	public void acceptVisitor(Visitor visitor){
		visitor.visit();
	}

}
