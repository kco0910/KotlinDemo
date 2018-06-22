package com.fly.kotlin.practice

/**
 * kotlin使用Companion Objects解决静态类成员的概念
 * Created by Fj on 2018/6/22.
 */
class CompanionObjects {
    companion object Factory {
        fun create(): CompanionObject = CompanionObject()
    }
}

fun main(args:Array<String>){
    //陪伴对象中定义的成员是可以直接通过类名访问的。
    CompanionObjects.create()

}

