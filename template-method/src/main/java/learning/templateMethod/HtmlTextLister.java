package learning.templateMethod;

/**
 * Created by keiwada on 2018/03/24.
 */
public class HtmlTextLister extends abstractTemplateStringLister{
		String formatHeader(){
			return "&lt;ul>\r\n";
		}
		String formatItem(String item){
			return "  &lt;li>" + item + "&lt;/li>\r\n";
		}
		String formatFooter(){
			return "&lt;/ul>\r\n";
		}
}
