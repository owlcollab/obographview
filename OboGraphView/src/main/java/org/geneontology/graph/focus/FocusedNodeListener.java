package org.geneontology.graph.focus;

import org.semanticweb.owlapi.model.OWLObject;

public interface FocusedNodeListener {
	
	public void focusedChanged(OWLObject oldFocus, OWLObject newFocus);

}
