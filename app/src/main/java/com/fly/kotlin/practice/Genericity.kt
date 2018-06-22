package com.fly.kotlin.practice

/**
 * 泛型:
 * out 声明的泛型占位符只能在获取泛型类型值的地方，如函数的返回值
 * in 声明的泛型占位符只能在设置泛型类型值的地方。如函数的参数
 * Created by Fj on 2018/6/22.
 */
class Genericity {

}

abstract class Sourece<out T> {
    abstract fun nextT(): T
}

fun demo(strs: Sourece<String>) {
    val objects: Sourece<Any> = strs
}


abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    x.compareTo(1.0)
    val y: Comparable<Double> = x
}