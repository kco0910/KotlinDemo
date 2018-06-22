package com.fly.kotlin.practice

/**
 * 封闭类
 * 使用封闭类的好处是when表达式，不需要再使用else形式了
 * Created by Fj on 2018/6/22.
 */
class SealedClass {

}

sealed class Expr
data class Const(val number:Double):Expr()
data class Sum(val el:Expr,val e2:Expr):Expr()
object NotANumber :Expr()
