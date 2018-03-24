package learning.templateMethod;

/**
 * Created by keiwada on 2018/03/24.
 */
public abstract class abstractTemplateStringLister {

	abstract String formatHeader();
	abstract String formatItem(String item);
	abstract String formatFooter();


	public final String display(String[] items) {
		StringBuilder result = new StringBuilder(this.formatHeader());
		for(String item : items) result.append(this.formatItem(item));
		result.append(this.formatFooter());
		return result.toString();
	}
}
