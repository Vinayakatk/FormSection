package metamodel;

import java.util.Arrays;
import java.util.List;

public class Son {
	private List<son2> li = Arrays.asList(new son2("vini"),new son2("karthik"));
	
	public List<son2> getLi() {
		return li;
	}
	public Son(String name) {
		super();
		this.name = name;
	}

	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
