package com.fly.kotlin.practice

/**
 * 对象:
 * 1、实现java匿名类的功能
 * 2、匿名对象只能用在本地（函数〉或 private 声明中。如果将匿名对象用于 public 函数的返
回值，或 public 属性的类型，那么 otlin 译器会将这些函数或属性的返回类型重新定义为匿
名对象的父类型，如果匿名对象没有实现任何接口，也没有从任何类继承，那么父类型就
Any 因此，添加在匿名对象中的任何成员将无法访问。
 * Created by Fj on 2018/6/22.
 */
open class ObjectClass(name: String) {
    open var name = name
    open fun verify() {
        println("verify")
    }
}

interface MyInterface {
    fun closeData() {
        println("closeData")
    }
}

fun process(obj: ObjectClass) {
    obj.verify()
    if (obj is MyInterface) {
        obj.closeData()
    }
}

fun foo() {
    //建立一个对象，该对象没有任何父类型
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}

class Test1() {
    //private 函数，返回类型是匿名对象本身，可以访问x
    private fun foo() = object {
        val x: String = "foo"
    }

    //public 函数,由于匿名对象没有任何父类型，隐藏返回的返回类型是Any
    fun publicFoo() = object {
        val x: String = "publicFoo"
    }

    fun bar() {
        //可以访问
        val x1 = foo().x
        //编译错误，因为publicFoo是public方法，返回类型是Any
        //publicFoo().x
    }
}

fun main(args: Array<String>) {
    process(ObjectClass("xx"))

    //使用匿名类
    process(object : ObjectClass("cc") {
        override fun verify() {
            println("objec verify")
        }
    })

    //匿名类继承
    process(object : ObjectClass("DD"), MyInterface {
        override fun verify() {
            println("object verify")
        }
    })

}

