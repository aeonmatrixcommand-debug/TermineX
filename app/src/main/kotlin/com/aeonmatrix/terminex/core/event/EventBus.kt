package com.aeonmatrix.terminex.core.event

class EventBus {

    private val events = mutableListOf<Event>()


    fun publish(event: Event) {

        events.add(event)

        println(
            "Event published: ${event.name}"
        )
    }


    fun history(): List<Event> {
        return events
    }
}
