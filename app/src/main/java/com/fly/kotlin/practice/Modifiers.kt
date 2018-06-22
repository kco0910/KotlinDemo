package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
//open表明Outer是可继承的,class默认是final，是不允许继承的
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 //默认是public
    open var mName: String = "kotlin"
    var mOtherName: String = "java"
    var mPhpName: String = "php"

    protected class Nested {
        public var e: Int = 5

    }

    //open 声明方法才能被override
    open fun getName(): String = mName

    fun getOtherName(): String = mOtherName

    open fun getPhpName():String  = mPhpName
}

//继承Outer类,需要调用父类的构造器
class Modifiers : Outer() {

    //无法访问父类的a常量
    //可以访问b、c和d
    //Nested类与e变量可以访问
    override val b = 5
    //val可以被重写为var,但var不能被重写为val
    override var mName: String = "child kotlin"

    //子类声明override才能重写父类方法
    override fun getName(): String {
        var name = super.getName()
        return "child :" + name
    }
    //阻止getPhpName被子类重写，需要在override前面加final
    final override fun getPhpName(): String {
        return "["+super.getPhpName()+"]"
    }

}

fun Main(args: Array<String>) {
}

