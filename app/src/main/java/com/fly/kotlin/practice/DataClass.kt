package com.fly.kotlin.practice

/**
 * 数据类
 * 主构造器至少要有一个参数
 * 主构造器的所有参数必须标记为val或者var
 * 数据类不能是抽象类、open类、封闭类或者内部类
 * Created by Fj on 2018/6/22.
 */
class DataClass {

}
//普通的数据类
class User(name: String, age: Int) {
    var name: String = name
    var age: Int = age
    override fun toString(): String {
        return "User(name=$name,aget=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (other is User) {
            if (name == other.name && age == other.age) {
                return true
            }
        } else {
            return false
        }
        return false
    }

    fun copy(name: String=this.name,age: Int=this.age) = User(name, age)
}
//数据类
data class User1(val name: String,var age: Int)

fun main(args: Array<String>) {
    var user1 = User("Mike", 34)
    var user2 = User("Mike", 34)

    //copy
    var copy = user1.copy("xxx", 2)

}