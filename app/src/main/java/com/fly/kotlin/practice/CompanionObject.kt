package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/22.
 */
class CompanionObject {
    companion object {

    }
}

fun CompanionObject.Companion.test(){
    println("这是伴随对象成员函数")
}

fun main(args:Array<String>){
    CompanionObject.test()
}