package com.nowcoder.async;

import java.util.List;

/**
 * Created by JasonC on 4/2/2017.
 */
public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
