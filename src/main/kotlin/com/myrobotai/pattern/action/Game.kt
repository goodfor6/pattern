package com.myrobotai.pattern.action

abstract class Game{
    abstract fun initialize()

    abstract fun startPlay()

     abstract fun end()

     fun play(){
         initialize()
         startPlay()
         end()
     }
}



