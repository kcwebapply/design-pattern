package learning.bridge;

/**
 * Created by keiwada on 2018/03/25.
 */
public class HumanBridge {

	public Human human;

	public HumanBridge(Human human){
		this.human = human;
	}
	//human抽象クラスの全てのメソッドについて、HumanBridgeから呼べるようにしておく必要がある。
	//そうしなければ、機能追加サブクラス(ex:NewHumanクラス)からPresidentやStudentの実装の全てを呼ぶことができなくなる。
	public void humanEat(){
		this.human.eat();
	}
}
