package cn.chronic.zoom.event.events.callables;

import cn.chronic.zoom.event.events.Event;
import cn.chronic.zoom.event.events.Typed;

public abstract class EventTyped implements Event, Typed {

    private final byte type;

    protected EventTyped(byte eventType) {
        type = eventType;
    }
    @Override
    public byte getType() {
        return type;
    }

}
