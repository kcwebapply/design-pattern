package learning.bridge;

/**
 * Created by keiwada on 2018/03/25.
 */
public class NewHuman extends HumanBridge {

	public NewHuman(Human human){
		super(human);
	}

	public void fly(){
		System.out.println("fly():しかも飛べるよ");
	}
}
