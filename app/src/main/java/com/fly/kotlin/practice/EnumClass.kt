package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */

enum class Direction{
    NORTH,SOUTH,WEST,EAST

}

enum class Di private constructor(val d:Int){
    NORTH(1),SOUTH(2),WEST(3),EAST(4);

    override fun toString(): String {
        return d.toString()
    }
}

class EnumClass {

    fun f1(){
        var direction1:Direction
        var direction2:Direction = Direction.NORTH
        var direction3:Direction = Direction.EAST
        if (direction2 == direction3){
            println("枚举类型值相等")
        }else{
            println("枚举类型值不相等")
        }
    }

    fun f2(){
        var name = Di.NORTH.name
        var ordinal = Di.NORTH.ordinal
        println("name:$name,ordinal:$ordinal")
    }
}



