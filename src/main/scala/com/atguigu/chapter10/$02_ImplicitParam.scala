package com.atguigu.chapter10

object $02_ImplicitParam {

  /**
    * 隐式参数: 在调用方法的时候,scala会悄悄的自动给方法的参数传值
    *     语法:
    *         1、在定义方法的时候指定后续给方法哪个参数传值: def 方法名(参数名:类型,...)(implicit 参数名:类型):返回值类型 = {....}
    *         2、指定后续scala给隐式参数的传的值: implicit val 参数名:类型 = 值
    */
  def main(args: Array[String]): Unit = {

    import com.atguigu.chapter01.$01_Implicits.a
    println(m1(10, 20)(200))
    println(m1(50, 60))
    m1(11,22)
    m1(33,44)
  }

  def m1(x:Int,y:Int)(implicit z:Int) = x+y+z
}
