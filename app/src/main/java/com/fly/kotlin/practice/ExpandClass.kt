package com.fly.kotlin.practice

/**
 * 扩展类的目的有很多，除了系统类需要扩展外，我们自己编写的类也需要扩展。
 *  如果类内部的成员函数和通过扩展添加的成员函数冲突，那么内部成员函数的
 *  优先级更高，通过扩展无法覆盖内部成员函数
 *
 *  扩展类的目的有很多，除了系统类需要扩展外，我们自己编写的类也需要扩展。
 * Created by Fj on 2018/6/21.
 */
class ExpandClass {
    //为MutableList这个API类添加一个swap方法
    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    fun f1() {
        var mutableList = mutableListOf(1, 2, 3)
        mutableList.swap(0, 2)
        println(mutableList)
    }
}

class C {
    fun baz() {
        println("C.baz")
    }

    //在C类中扩展ExpandClass
    fun ExpandClass.foo() {
        f1()  //调用ExpandClass类的bar方法
        baz() //调用C类的baz方法
    }

    fun caller(d: ExpandClass) {
        d.foo() //调用扩展方法
    }
    //调用特定类的成员函数
    fun D.foo(){
        println(toString()) //调用D.toString()方法
        println(this@C.toString()) //调用C.toString()方法
    }

    override fun toString(): String {
        return "C类"
    }
}

class D{
    override fun toString(): String {
        return "D类"
    }
}



fun main(args: Array<String>) {
    C().caller(ExpandClass())
}