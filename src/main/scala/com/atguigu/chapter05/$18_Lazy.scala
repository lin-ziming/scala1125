package com.atguigu.chapter05

object $18_Lazy {

  /**
    * 惰性求值: lazy val 变量名 = 值
    *   变量使用lazy修饰之后不会立即初始化,而是等到真正使用该变量的时候才会初始化
    *
    */
  def main(args: Array[String]): Unit = {

    val name = "lisi"
    println(name)


    lazy val age = 10
    println(age)
    println("------------")


  }
}
