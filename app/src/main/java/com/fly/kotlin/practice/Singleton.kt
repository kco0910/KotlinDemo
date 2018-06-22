package com.fly.kotlin.practice

/**
 * Kotlin 类不支持静态方法和成员,使用Objects特性
 * Created by Fj on 2018/6/21.
 */
class Singleton private constructor(){
    public var value:Singleton?=null
    private object mHolder{
        var INSTANCE = Singleton()
    }
    companion object Factory{
        fun getInstance():Singleton{
            return mHolder.INSTANCE
        }
    }
}