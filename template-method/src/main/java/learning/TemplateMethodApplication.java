package learning;

import learning.templateMethod.HtmlTextLister;
import learning.templateMethod.PlainTextLister;
import learning.templateMethod.abstractTemplateStringLister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateMethodApplication {

	public static void main(String[] args) {

		SpringApplication.run(TemplateMethodApplication.class, args);
		exexute();
	}

	public static void  exexute(){
		String[] items = {"First", "Second", "Third"};

		/*abstractTemplateStringLister l1 = new PlainTextLister();
		StringLister l2 = new HtmlStringLister();
		System.out.println(l1.display(items));
		System.out.println(l2.display(items));*/
		abstractTemplateStringLister l1 = new PlainTextLister();
		abstractTemplateStringLister l2 = new HtmlTextLister();
		System.out.println(l1.display(items));
		System.out.println(l2.display(items));
	}
}
