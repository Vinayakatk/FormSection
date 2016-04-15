import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

class Personpp {
	
	@Accessors
	var String name
	@Accessors
	var  Contain c
}


class Contain {
	@Accessors
	var Personpp ref
}


class Package2{
	@Accessors
	var List<Person2> persons=newArrayList()
}
