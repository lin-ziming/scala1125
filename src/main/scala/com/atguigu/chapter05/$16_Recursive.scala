package com.atguigu.chapter05

import com.atguigu.chapter05.$16_Recursive.m1

object $16_Recursive {

  /**
    * 递归:  自己调用自己称之为递归
    *     前提:
    *         1、必须要有退出条件,不能陷入死循环
    *         2、必须指定返回值类型
    * 递归函数不能定义在方法中
    */
  def main(args: Array[String]): Unit = {


    println(m1(5))

    println(func(5))

    def m2(n:Int):Int = {
      if(n==1) 1
      else
        n * m2(n-1)
    }

    println(m2(5))

    var func2:Int => Int = null
    func2 = (n:Int) => {
      if(n==1) 1
      else n * func2(n-1)
    }

    println(func2(5))

  }

  /**
    * 递归函数
    */
  val func: Int => Int = (n:Int) => {
    if(n==1) 1
    else n * func(n-1)
  }

  /**
    * 递归方法
    * @param n
    * @return
    */
  def m1(n:Int):Int = {
    if(n==1) 1
    else
      n * m1(n-1)
  }
}
