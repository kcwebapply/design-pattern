package learning.templateMethod;

/**
 * Created by keiwada on 2018/03/24.
 */
public class PlainTextLister extends abstractTemplateStringLister {
	String formatHeader(){
		return "";
	}
	String formatItem(String item){
		return " - " + item + "\r\n";
	}
	String formatFooter(){
		return "";
	}
}
