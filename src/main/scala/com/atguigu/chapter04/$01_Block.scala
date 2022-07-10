package com.atguigu.chapter04

object $01_Block {

  /**
    * scala流程控制分为
    *       分支判断: if分支判断
    *       循环: for、while、do-while循环
    *scala没有switch
    *
    * 块表达式: 由{}包裹的一段代码称之为块表达式,块表达式有返回值,返回值是{}中最后一个表达式的结果值。
    *
    *
    *
    */
  def main(args: Array[String]): Unit = {

    val x = {
      println("hello....")
      val a = 10
      val b = 20
      val c = a + b
      c
    }

    println(x)
     x
  }


}
