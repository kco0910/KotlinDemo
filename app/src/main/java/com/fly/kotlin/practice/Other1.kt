package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/22.
 */
class Other1 {
    //声明可为null的字符串需要加?
    var b: String? = null
    var len = b?.length ?: -1

    //数据解构
    data class Person(var name: String, var age: Int, var salary: Float)


    fun f1() {
        var person = Person("bill", 30, 1200f)
        var (name, age, salary) = person //数据解构
        println("name=$name age =$age salary = $salary")

        //安全调用空对象
        println(b?.length)
    }


}