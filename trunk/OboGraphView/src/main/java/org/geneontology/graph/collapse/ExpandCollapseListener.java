package org.geneontology.graph.collapse;

import java.util.EventListener;


public interface ExpandCollapseListener extends EventListener {
	public void expandStateChanged(ExpansionEvent e);
}
