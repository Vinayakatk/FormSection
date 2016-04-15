package metamodel;

import java.util.Arrays;
import java.util.List;

public class JavaMetaModel {
	public String getName(){
		return "Vinay";
	}
	public List<Son> getSons(){
		return Arrays.asList(new Son("22"),new Son("33"));
	}
}
