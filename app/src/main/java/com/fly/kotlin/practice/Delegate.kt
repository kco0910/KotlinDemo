package com.fly.kotlin.practice

import java.util.*
import kotlin.reflect.KProperty

/**
 * Created by Fj on 2018/6/22.
 */
class Delegate {

    var name:String=""
    operator fun getValue(thisRef:Any?,property:KProperty<*>):String{
        var className = thisRef.toString().substringBefore('@')
        println("$className.get 已经被调用")
        return name
    }
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        var className = thisRef.toString().substringBefore('@')
        println("$className.set已经被调用")
        name = value
    }


    interface Base {
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override fun print() {
            print(x)
        }
    }

    //使用by关键字将Base类的print函数委托给了一个对象
    //改对象需要通过Derived类的主构造器传入，而且该对象的类
    //必须实现Base接口，如果Derived类不进行委托，就需要再实现
    //一遍print函数
    class Derived(b: Base) : Base by b {
        fun getName(): String {
            return "bill"
        }
    }


}

class MyClass1 {
    var name: String = ""
        get() {
            println("Myclass.get已经备调用")
            return field
        }
        set(value) {
            println("Myclass.set已经被调用")
            field = value
        }
}

class MyClass2 {
    var name: String = ""
        get() {
            println("MyClass2.get已经被调用")
            return field
        }
        set(value) {
            println("MyClass2.set已经被调用")
            field = value
        }
}

class TestClass1{
    var name:String by Delegate()
}
class TestClass2{
    var name:String by Delegate()
}


fun main(args: Array<String>) {
    var baseImpl = Delegate.BaseImpl(10)
    Delegate.Derived(baseImpl).print()

    //正常情况下MyClass1和MyClass2两个都有name属性
    var c1 = MyClass1()
    c1.name = "bill"
    var c2 = MyClass2()
    c2.name = "mike"

    //通过委托将TestClass1和TestClass2 name属性委托给Delegate
    var t1 = TestClass1()
    t1.name = "TestClass1"
    var t2 = TestClass2()
    t2.name = "TestClass2"



}