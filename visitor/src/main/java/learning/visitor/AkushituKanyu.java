package learning.visitor;

/**
 * Created by keiwada on 2018/03/25.
 */

public  class AkushituKanyu implements Visitor {

	@Override
	public void visit() {
		System.out.println("払えよーお前払えよー");
		knock();
	}

	private void knock(){
		System.out.println("<しつこくドアを叩く>");
	}
}
