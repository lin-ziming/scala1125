package com.atguigu.chapter06

import java.util

object $13_NewType {

  /**
    * 新类型: 给指定类型起别名
    *     语法: type 别名 = 类型
    */
  def main(args: Array[String]): Unit = {

    type StringList = util.ArrayList[String]

    val list = new StringList()

    list.add("hello")
    list.add("spark")
    list.add("scala")

    println(list)
  }
}
