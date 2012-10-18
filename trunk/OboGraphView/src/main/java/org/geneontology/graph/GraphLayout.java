package org.geneontology.graph;

import java.awt.Shape;

import org.geneontology.graph.LinkDatabase.Link;
import org.semanticweb.owlapi.model.OWLObject;

public interface GraphLayout {

	public void reset();
	
	public void addNode(OWLObject node);
	public void addEdge(Link link);
	
	public void setNodeDimensions(OWLObject node, int width, int height);
	
	public void doLayout();
	
	public Shape getEdgeShape(Link link);
	public Shape getNodeShape(OWLObject node);
	
	
}
