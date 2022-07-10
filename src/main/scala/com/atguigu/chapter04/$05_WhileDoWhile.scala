package com.atguigu.chapter04

object $05_WhileDoWhile {

  /**
    * while、di-while与java的完全一样
    *
    */
  def main(args: Array[String]): Unit = {

    var a = 0
    while(a<=10){
      println(s"a=${a}")
      a = a+1
    }

    var b = 0
    do{
      println(s"b=${b}")
      b=b+1
    }while(b<=10)
  }
}
