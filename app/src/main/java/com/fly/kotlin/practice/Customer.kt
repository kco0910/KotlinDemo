package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
class Customer {
    var name: String = "Bill"
    var value: Int = 20
    var flag: Boolean = true
    fun description() {
        println("name:$name  value:$value  flag:$flag")
    }
}

//getter setter
class Customer2 {
    val name: String
        get() = "Bill"
    var v: Int = 20
    var value: Int
        get() = v
        set(value) {
            println("value属性被设置")
            v = value
        }
}

class Customer3 {
    val name: String
        get() = "Bill"
    var value: Int = 0
        get() = field  //从field中读取属性值
        set(value) {
            println("value属性被设置")
            field = value //将属性值写入field中
        }
}


fun main(args: Array<String>) {
    var value = Customer2().value
    println("value:" + value)

    var customer3 = Customer3()
    customer3.value = 30
}