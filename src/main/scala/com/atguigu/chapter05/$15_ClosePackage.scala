package com.atguigu.chapter05

object $15_ClosePackage {

  /**
    * 闭包: 使用了外部变量的函数称之为闭包
    */
  def main(args: Array[String]): Unit = {

    println(func(100))
  }

  val y = 10

  /**
    * 闭包函数
    */
  val func = (x:Int) => {

    x + y
  }
}
