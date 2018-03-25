package learning.visitor;

/**
 * Created by keiwada on 2018/03/25.
 */

public class YamatoUnyu implements Visitor {

	@Override
	public void visit() {
		System.out.println("大和でーすお届け物に参りましたー");
		callBell();
	}

	private void callBell(){
		System.out.println("<ベルを鳴らす>");
	}
}
