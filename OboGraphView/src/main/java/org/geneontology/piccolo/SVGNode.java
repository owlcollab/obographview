package org.geneontology.piccolo;

import java.io.IOException;

import org.geneontology.gui.SVGIcon;

public class SVGNode extends IconNode {

	// generated
	private static final long serialVersionUID = 3224240826005055637L;

	public SVGNode(String uri) throws IOException {
		super(new SVGIcon(uri));
	}

}
