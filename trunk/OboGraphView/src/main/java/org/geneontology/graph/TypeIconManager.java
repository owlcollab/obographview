package org.geneontology.graph;

import org.semanticweb.owlapi.model.OWLObjectProperty;

import edu.umd.cs.piccolo.PNode;

public interface TypeIconManager {
	public PNode getIcon(OWLObjectProperty type);
}
