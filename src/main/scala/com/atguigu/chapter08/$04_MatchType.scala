package com.atguigu.chapter08

import scala.util.Random

object $04_MatchType {

  class Person

  /**
    * 匹配类型语法
    *     变量 match {
    *         case x:类型1 => ...
    *         case x:类型2 => ....
    *         ...
    *         case x => ...
    *     }
    *
    */
  def main(args: Array[String]): Unit = {

    val arr = Array("hello",20,15.1,false,'c',new Person)

    val index = Random.nextInt( arr.length )

    println(s"index=${index}")

    arr(index) match {

      case _:String => println("字符串。。。。")
      case x:Char => println("字符。。。。")
      case x:Double => println("浮点型。。。。")
      case x:Person => println("Person。。。。")
      case x => println("任意类型....")
    }
  }
}
