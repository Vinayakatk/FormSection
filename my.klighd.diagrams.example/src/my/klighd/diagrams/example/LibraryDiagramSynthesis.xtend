package my.klighd.diagrams.example

import javax.inject.Inject

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

import org.eclipse.emf.examples.extlibrary.Library

class LibraryDiagramSynthesis extends AbstractDiagramSynthesis<Library> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    
    override KNode transform(Library model) {
         val root = model.createNode().associateWith(model)=>[parent|
        	model.writers.forEach[writer|parent.children+=writer.createNode=>[
        		node|
        	node.setNodeSize(20,20)	
        	val rect = node.addRoundedRectangle(5,5)
        	rect.addText(writer.name).setSurroundingSpaceGrid(20, 0);
      
        	]
        	writer.books.forEach[book|
        		writer.node.ports+=book.createPort=>[
        			it.setPortSize(10,10)
        			it.setPortPos(20,20)
        		]
        			model.conn.forEach[cosn|
        				cosn.createEdge=>[
        					e|
        					
        					e.addPolyline.addHeadArrowDecorator

e.target=cosn.tar.node
e.source=cosn.src.node        				]
        			]
        		
        	]
        	]
        	   
        		
        	
        	
        ]
        
        root.setLayoutOption("de.cau.cs.kieler.interactive",true)
        
        return root;
    }
    
}
