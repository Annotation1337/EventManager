package cn.chronic.zoom.event.events.callables;

import cn.chronic.zoom.event.events.Cancellable;
import cn.chronic.zoom.event.events.Event;

public abstract class EventCancellable implements Event, Cancellable {

    private boolean cancelled;

    protected EventCancellable() {
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean state) {
        cancelled = state;
    }

}
