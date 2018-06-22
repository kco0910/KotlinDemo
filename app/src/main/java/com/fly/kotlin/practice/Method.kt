package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
class Method {
    var mName: String = "fj"


    //函数支持默认值，如果一个参数有默认值，则之后的参数必须都有默认值
    fun f1(url: String, schema: String = "https") {
        println("$schema://$url")
    }

    //指定参数名传参
    fun f2(value: Int, name: String = "Bill", age: Int = 30, salary: Float = 4000F) {
        println("value:$value,name:$name,age:$age,salary:$salary")
    }

    //可变参数
    fun f3(vararg persons: Method): List<Method> {
        var arrayList = ArrayList<Method>()
        for (person in persons) {
            arrayList.add(person)
        }
        return arrayList
    }

    //单行函数 如果函数体只有一行代码，可以直接在函数申明后面加等号(=)
    fun f4(age: Int) = println("age :$age")

    fun f5(): String = mName

}

fun main(args: Array<String>) {
    Method().f1("baidu.com")
    Method().f1("google.com", "http")

    //只修改最后一个值
    Method().f2(10, "Bill", 20, 500.0f)
    Method().f2(52, salary = 240.0f)

}