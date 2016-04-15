
class  some2 {
	def dispatch top(Packagepp p){
		var p2 =  new Package2 
		p2.persons+=p.persons.map[top as Person2] 
		
	}
	def dispatch top(Personpp p){
		var t = new Person2
		t.name=p.name
		t.c = p.c.top as Contain2
		t
	}
	def dispatch   top(Contain p){
		var c = new Contain2
		c.ref = p.ref.top as Person2
		c
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
		
		var Package2 pp = new some2().top(p) as Package2
		println()
		
	}
	
}