
class  BestForRecursive {
	def dispatch create new Package2 top(Packagepp p){
		persons+=p.persons.map[top as Person2] 
		
	}
	def dispatch create new Person2 top(Personpp p){
		name=p.name
		c = p.c.top as Contain2
	}
	def dispatch create new Contain2 top(Contain p){
		ref = p.ref.top as Person2
	}
	
	def static void main(String[] args) {
		var p = new Packagepp=>[
			var p1= new Personpp=>[
				var c = new Contain
				name="vini"
				it.c=c
			]
			var p2 = new Personpp=>[
				var c = new Contain
				it.c=c
				name="shama"
			]
			
			p1.c.ref=p2
			p2.c.ref=p1
			
			persons+=p1
			persons+=p2
			
		]
		// Cache all visited transformation nodes 
		
		var Package2 pp = new BestForRecursive().top(p) as Package2
		println()
		
	}
	
}