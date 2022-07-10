package com.atguigu.chapter05

object $06_HightFunction {

  /**
    * 高阶函数: 以函数作为参数/返回值的方法/函数称之为高阶函数
    *
    */
  def main(args: Array[String]): Unit = {

    val func = (x:Int,y:Int) => {
      x+y
    }
    println(m1(10, 20, func))

    println(f(10, 20, func))

  }

  /**
    * 高阶函数:
    */
  val f = (x:Int,y:Int, func: (Int,Int)=>Int ) => {
    func(x,y)
  }

  /**
    * 高阶函数:
    */
  def m1(x:Int,y:Int, func: (Int,Int)=>Int ) = {

    //func.apply(x,y)
    func(x,y)
  }
}
