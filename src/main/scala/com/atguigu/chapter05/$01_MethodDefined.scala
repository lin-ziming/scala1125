package com.atguigu.chapter05

object $01_MethodDefined {

  /**
    * 方法定义的语法: def 方法名( 参数名:类型, ... ):返回值类型 = { 方法体 }
    */
  def main(args: Array[String]): Unit = {

    println(sum(10, 20))

    hello()
  }

  def sum( x:Int, y:Int ):Int = {
    x+y
  }

  def hello():Unit = {
    println("hello...")
  }
}
