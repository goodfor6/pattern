package com.myrobotai.pattern.action

class Football:Game(){
    override fun initialize() {
        println(" Football Game Initialize! Start Playing !!!")
    }

    override fun startPlay() {
        println(" Football Game Started ! Enjoy Game !!!")
    }

    override fun end() {
        System.out.println(" Football Game Finished !  Good Game !!!")
    }

}