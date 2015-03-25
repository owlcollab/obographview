This projects provides a visualization for ontologies in the style of OBO-Edit.
It's a standalone library and provides a Protégé plugin

# OBO Graph View #

This ontology visualization is based on the OBO-Edit code. It was extracted and modified to use the OWL-API.
Furthermore, it can be used in any Java Swing application.

# Protégé PlugIn #

The plugin is tested and developed with Protégé Version 4.1 and 4.2 (beta).
For more help on Protégé see [Protégé Documentation](http://protegewiki.stanford.edu/wiki/Protege4UserDocs)

## Installation as Protégé PlugIn ##
Download the latest version from the [Downloads](http://code.google.com/p/obographview/downloads/list) tab.

Unzip the archive file. There should be one file: **org.geneontology.view.protege.jar**

Copy this jar file in the plugins folder of your Protégé installation.

The Plugin is a View Component, it can be a component of any tab in Protégé. To include it in a tab navigate to:

Window -> Views -> Ontology Views -> OBO Graph View Component

This will create a new component, which can be dropped in an appropriate position in the Protégé tab.
The recommended tab is the 'Classes' tab.

## Usage ##

To start the rendering, click on the **Synchronize View** button.

The plugin requires a reasoner and will warn you, if there is no up-to-date reasoner instance available.

Selections in the Class hierarchy are reflected in the visualization. A selection will update the rendered nodes.