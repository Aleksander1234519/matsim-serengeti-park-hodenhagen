package org.matsim.analysis;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.LinkEnterEvent;
import org.matsim.api.core.v01.events.LinkLeaveEvent;
import org.matsim.api.core.v01.events.handler.LinkEnterEventHandler;
import org.matsim.api.core.v01.events.handler.LinkLeaveEventHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistogramHandler implements LinkLeaveEventHandler {

    List<Integer> times = new ArrayList<>();
    Map<String, Integer> histogram = new HashMap<>();

    @Override
    public void handleEvent(LinkLeaveEvent linkLeaveEvent) {
        double time = linkLeaveEvent.getTime()-(10*3600);
        String key = String.valueOf(((int)(time/3600)));
        if(!histogram.containsKey(key)){
            histogram.put(key, 1);
        }
        histogram.put(key, histogram.get(key)+1);
    }
}
