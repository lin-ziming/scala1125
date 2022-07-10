package com.atguigu.chapter05

object $05_FunctionObject {

  /**
    * 方法就是函数,函数也是对象
    * 函数的简化: 函数体中只有一行语句,函数体的{}可以省略
    * 函数是对象,函数类型是: (参数类型,...) => 返回值类型
    *
    */
  def main(args: Array[String]): Unit = {

    println(func.apply(10, 20))
    println(func(10, 20))
    println(func2.apply())
    println(func2())

    println(func3(10, 20))

    val f = func
    println(f(10, 30))
  }
  //定义函数第一种形式
  val func = (x:Int,y:Int) =>  x+y

  val func2 = () =>  println("hello...")

  val name = "lisi"

  //定义函数第二种形式
  val func3: (Int,Int)=>Int = new Function2[Int,Int,Int] {

    override def apply(v1: Int, v2: Int): Int = v1+v2
  }

}
