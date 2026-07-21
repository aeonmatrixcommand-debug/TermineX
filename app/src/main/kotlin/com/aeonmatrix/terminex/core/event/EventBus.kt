package com.aeonmatrix.terminex.core.event


class EventBus {

    private val listeners =
        mutableListOf<EventListener>()


    fun register(
        listener:EventListener
    ){

        listeners.add(listener)

    }


    fun publish(
        event:Event
    ){

        listeners.forEach {
            it.onEvent(event)
        }

    }

}
