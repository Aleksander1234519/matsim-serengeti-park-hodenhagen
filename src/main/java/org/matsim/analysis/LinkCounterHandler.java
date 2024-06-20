package org.matsim.analysis;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.LinkEnterEvent;
import org.matsim.api.core.v01.events.handler.LinkEnterEventHandler;

public class LinkCounterHandler implements LinkEnterEventHandler {

    int counter = 0;

    @Override
    public void handleEvent(LinkEnterEvent linkEnterEvent) {
        if(linkEnterEvent.getLinkId().equals(Id.createLinkId("3624560720003f"))){
            counter++;
        }
    }
}
