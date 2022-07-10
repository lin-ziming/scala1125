package com.atguigu.chapter05

object $13_MethodAndFunction {

  /**
    * 方法和函数区别:
    *     1、方法如果定义在object/class中可以重载的，函数是对象,函数名就是变量名,不能重载的[同一个作用域不允许多个同名变量]
    *     2、方法存储在方法区中,函数是对象保存在堆中
    * 方法和函数的联系:
    *     1、方法如果定义在方法中，其实就是函数不能重载
    *     2、方法可以手动转成函数,可以通过 方法名 _
    */
  def main(args: Array[String]): Unit = {

    def m2(x:Int) = x*x
    //def m2(x:Int,y:Int) = x*x

    val f = m2 _
    println(m2(10))

    println(m3(100, m2 _))
  }

  val func = (x:Int) => x*x
  //val func = (x:Int,y:Int) => x+y
  /**
    * 方法重载
    */
  def m1(x:Int) = x*x

  def m1(x:Int,y:Int) = x+x

  def m3(x:Int,func: Int => Int) = func(x)
}
