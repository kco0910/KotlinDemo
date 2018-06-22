package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
class InnerClass {
    private val bar: Int = 1

    //第一种内部类
    class Nested {
        fun foo() = 2
    }

    //第二种内部类
    inner class Inner {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
    //两种内部类的声明，对应两种调用方式
    InnerClass.Nested().foo()

    InnerClass().Inner().foo()

}