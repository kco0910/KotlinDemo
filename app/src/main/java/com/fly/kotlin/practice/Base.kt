package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
/**
 * 相当于java的Main函数
 */
fun main(args: Array<String>) {

}

fun array() {
    val arrayOf = arrayOf(1, 2, 3, 'a', "c")
    println(arrayOf[3])
    var arrayOfNulls = arrayOfNulls<Int>(10)
    println("array的长度:" + arrayOfNulls.size)
    var intArrayOf = intArrayOf(20, 30, 40, 50, 60)
    println("intArrayOf[2] = " + intArrayOf[2])

}

fun str(a: Int) {
    //转义字符
    var s1 = "hello \n world"
    var s2: String = "世界\n你好"
    println("s1:" + s1)
    println("s2:" + s2)
    //保持数据格式
    var s3 = """hello
            |           world
            |     I  am  coming.
        """
    println("s3:" + s3)
}

/**
 * 字符串模板
 */
fun str2(a: Int, b: Float) {
    val i = 10
    val s1 = "i = $i"
    println(s1) // i=10

    val s2 = "adc"
    var str = "$s2 的长度是 ${s2.length}"
    println(str)
}

/**
 * 最后一个表达式是返回值
 */
fun if_else(): Int {
    var a = 20
    var b = 30
    val max = if (a > b) a else b

    val min = if (a > b) {
        println("choice a")
        a
    } else {
        println("choice b")
        b
    }
    return 0
}

fun getValue(x: Int): Int {
    return x * x;
}

/**
 * 想到于Java的switch
 */
fun key_when() {
    var x = 1
    when (x) {
        1 -> { //分支中多余一条语句,要用{...}
            println("x ===1")
            println("hello world")
        }
        2 -> print("x===2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    //当做表达式使用
    var m = when (x) {
        1 -> {
            println("x ===1")
            2
        }
        2 -> 3
        else -> {
            4
        }
    }

    //满足多个条件
    when (x) {
        1 -> {
            println(" x == 1")
        }
        2, 3 -> {
            println("x =1 or x =3")
        }
        else -> {
            println("x = $x")
        }
    }

    when (x) {
        //值范围
        in 1..10 -> println("1 -10")
        in 11..20 -> println("11 -20")
        !in 20..60 -> println("不属于20 - 60")
        else -> {
            println("x = $x")
        }
    }

    //分支条件是函数
    when(x){
        getValue(2) -> println("满足条件")
        getValue(3) -> println("不满足条件")
        else -> println("条件未知")
    }

}

fun key_for(){
    //for iterator 语法
    var intArrayOf = intArrayOf(2, 4, 6, 8, 10)
    for (item:Int in intArrayOf){
        println(item)
    }

    for (i in intArrayOf.indices){
        println("arr[$i] = "+intArrayOf[i])
    }
}

fun key_while(){
    var  i = 0
    while (i++<10){
        println(i)
    }

    do {
        if (i == 6)
            continue
        println(i)
        if (i ==5)
            break
    }while (--i>0)
}





