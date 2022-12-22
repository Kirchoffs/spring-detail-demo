package org.syh.spring.event.a_quickstart;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@FunctionalInterface
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {
    void onApplicationEvent(E event);
}
