package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
interface Interface {
    fun process()
    //接口中可以存在方法体，有方法体的可以不重写
    fun getName(): String {
        return "Bill"
    }
}

class MyClass : Interface {

    override fun process() {
        println("process")
    }

}