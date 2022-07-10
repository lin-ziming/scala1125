package com.atguigu.chapter11

object $03_GenericLowerUpper {

  class Animal

  class Pig extends Animal

  class MiniPig extends Pig

  class RedMimiPig extends MiniPig

  /**
    * 泛型的上下限
    *     上限:  T<:类型  代表T必须是指定类型或者是子类
    *     下限:  T>:类型  代表T必须是指定类型后者是父类 [下限限制不了]
    *
    */
  def main(args: Array[String]): Unit = {

    upper(new RedMimiPig)


    val r:Any = new RedMimiPig
    val r1:Any = 10
    lower(r1)
  }

  def upper[T<:Pig](t:T): Unit = {
    println(t)
  }

  def lower[T>:MiniPig]( t:T ) = {
    println(t)
  }
}
