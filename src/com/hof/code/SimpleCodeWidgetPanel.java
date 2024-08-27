package com.hof.code;

import com.hof.mi.widgetcanvas.panelcollection.CanvasWidgetPanel;
import com.hof.mi.widgetcanvas.panelcollection.CanvasWidgetPanelInfo;
//import com.hof.video.VideoWidgetURLSection;

public class SimpleCodeWidgetPanel extends CanvasWidgetPanel {

    public SimpleCodeWidgetPanel(CanvasWidgetPanelInfo info) {
        super(info);
    }
    
    /**
     * Add our SimpleCodeWidgetSection section to the CanvasWidgetPanel. 
     */
    @Override
    protected void buildSections() {
        super.buildSections();
        sections.add(1, new SimpleCodeWidgetSection());
    }
    
}
