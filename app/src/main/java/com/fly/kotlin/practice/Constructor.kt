package com.fly.kotlin.practice

/**
 * Created by Fj on 2018/6/21.
 */
class Constructor { //无构造方法的空类

}


class Test (firstName:String){ //主构造器

}

class Test2 constructor(firstName: String){
    //主构造器没有annotation 或修饰器,constructor可以省略
}

class Test3(firstName: String){
    init {//主构造器的实现
        println(firstName)
    }
}

class Test4(firstName: String){
    var name = firstName  //初始化成员属性
    init {
        println(firstName)
    }
}

class Test5{
    //第二构造函数
    constructor(firstName: String){
        println(firstName)
    }
}
//声明了主构造函数，第二构造函数都需要调用主构造器
class Test6(firstName: String){
    init {
        println(firstName)
    }
    constructor(firstName: String,secondName:String):this("f"){
        println(firstName+":"+secondName)
    }
    constructor(value:Int):this("F"){
        println(value)
    }
    constructor():this(20){//间接调用主构造器
        println("sssss")
    }
}








