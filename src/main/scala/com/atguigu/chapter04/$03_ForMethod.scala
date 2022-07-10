package com.atguigu.chapter04

object $03_ForMethod {

  /**
    * scala for循环两个重要方法:
    *     to方法
    *       语法: start.to(end[,step=1]) / start to end by step
    *       to方法生成的是左右闭合的集合[集合中每个元素间隔是step]
    *     until方法
    *       语法: start.until(end[,step=1]) / start until end by step
    *       until方法生成的是左闭右开的集合[集合中每个元素间隔是step]
    *
    */
  def main(args: Array[String]): Unit = {

    val list = 1 to (10,2)
    println(list.toList)

    val list2 = 10 until 0 by -1
    println(list2.toList)
  }
}
