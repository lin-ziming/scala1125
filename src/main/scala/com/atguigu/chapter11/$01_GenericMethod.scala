package com.atguigu.chapter11

object $01_GenericMethod {

  /**
    * 泛型方法语法: def 方法名[T,U,...](参数名:T,...):U = {....}
    *
    */
  def main(args: Array[String]): Unit = {

    m1(10,"lisi")

    m1("zhangsan",10)

  }

  def m1[T,U](x:T,y:U) = {
    println(x,y)
  }
}
