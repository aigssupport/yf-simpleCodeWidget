package com.hof.code;

import com.hof.mi.interfaces.Resource;
import com.hof.mi.widgetcanvas.panelcollection.CanvasWidgetPanel;
import com.hof.mi.widgetcanvas.panelcollection.CanvasWidgetPanelInfo;
import com.hof.mi.widgetcanvas.widgettemplate.AbstractCodeTemplate;
//import com.hof.video.VideoWidgetPanel;

public class SimpleCodeWidget extends AbstractCodeTemplate {

    /**
     * Name to be displayed to a user when they see this widget in the canvas panels.
     */
    @Override
    public String getTemplateTitle() {
        return "Simple Code Widget";
    }

    /**
     * Add any files that we will need the front-end to be able to load.
     */
    @Override
    public void setupResources() {
        /*
         * These are both files that have been ourselves so we can define them without setting the isLibrary flag
         * These files will be loaded in a single request when the code widget is initialised
         */
        addResource(new Resource("resource/SimpleCodeWidget.js", "text/javascript"));
    }

    /**
     * Define the entry point for this widget to be resource/SimpleCodeWidget.js
     * When the widget is loaded, this is the file that will be first executed.
     */
    @Override
    public String getMainJavascriptPath() {
        return "resource/SimpleCodeWidget.js";
    }
    
    /**
     *  Return the implementation of the SimpleCodeWidgetPanel
     */
    @Override
    public CanvasWidgetPanel getPanel(CanvasWidgetPanelInfo panelInfo) {
        return new SimpleCodeWidgetPanel(panelInfo);
    }
}
