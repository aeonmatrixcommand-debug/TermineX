package com.aeonmatrix.terminex.core.event


class EventBus {


    private val events =
        mutableListOf<Event>()


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

        events.add(event)


        println(
            "Event Published : ${event.type}"
        )


        listeners.forEach {

            it.onEvent(event)

        }

    }



    fun history():List<Event>{

        return events

    }


}
