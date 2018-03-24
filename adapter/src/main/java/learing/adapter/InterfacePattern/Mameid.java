package learing.adapter.InterfacePattern;

/**
 *
 */
public class Mameid extends Human implements Fisher {


	@Override
	public void swim() {
		System.out.println("swimming ... ");
		talk();
	}
}
