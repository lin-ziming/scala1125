package com.atguigu.chapter08

object $05_MatchArray {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,3,2,4)

    arr match  {
      case Array(x) => println("匹配数组只有一个元素。。。。")
      case Array(x,y,z) => println("匹配数组有三个元素....")
      case Array(1,y,z,_*) => println("匹配数组至少有三个元素并且第一个元素是1。。。")
      case Array(x,y,z,_*) => println("匹配数组至少有三个元素。。。")
    }
  }
}
