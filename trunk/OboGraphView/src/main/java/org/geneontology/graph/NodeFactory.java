package org.geneontology.graph;

import java.awt.Shape;

import org.geneontology.graph.LinkDatabase.Link;
import org.semanticweb.owlapi.model.OWLObject;

public interface NodeFactory {
	
	public OELink createLink(Link link, Shape s);
	
	public OENode createNode(OWLObject obj, Shape s);
}
