package com.aeonmatrix.terminex.core.task


class TaskEngine {


    private val tasks =
        mutableListOf<Task>()


    fun create(task:Task){

        tasks.add(task)

    }


    fun list():List<Task>{

        return tasks

    }

}
