package com.atguigu.chapter05

object $04_FunctionDefined {

  /**
    * 函数定义的语法: val 函数名 = (参数名:类型,...) => { 函数体 }
    *
    */
  def main(args: Array[String]): Unit = {

    println(func(30, 20))
  }

  /**
    * 函数的定义
    */
  val func = (x:Int,y:Int) => {
    x+y
  }

}
