package com.atguigu.chapter02

object $02_ParamDefined {

  /**
    * scala变量定义语法:  val/var 变量名:类型 = 值
    *     val与var的区别
    *         val定义的变量类似java final修饰的,不能修改变量值
    *         var定义的变量类似java 非final修饰的,可以修改变量值
    * scala定义变量的时候类型可以省略,省略之后scala会根据值自动推断类型
    * scala在定义变量的时候必须初始化
    *
    */
  def main(args: Array[String]): Unit = {

    val name:String = "lisi"

    //name = "zhangsan"
    var age:Int = 20
    age = 100

    println(name)
    println(age)

    val address = "lisi"
    println(address)

    //var sex:String
  }
}
