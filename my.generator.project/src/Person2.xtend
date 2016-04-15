

import org.eclipse.xtend.lib.annotations.Accessors

class Person2 {
	@Accessors
	var String name
	@Accessors
	var  Contain2 c
}

class Contain2 {
	@Accessors
	var Person2 ref
}