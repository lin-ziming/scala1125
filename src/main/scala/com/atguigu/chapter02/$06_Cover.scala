package com.atguigu.chapter02

object $06_Cover {

  /**
    * 数字与数字的转换
    *    1、低精度转高精度[Int->Long]: 自动转换
    *    2、高精度转低精度[Long->Int]: toXXX方法
    * 数字与字符串的转换
    *    1、数字转字符串: 拼接、toString
    *    2、字符串转数字: toXXX方法
    */
  def main(args: Array[String]): Unit = {

    //1、低精度转高精度[Int->Long]: 自动转换
    val x:Int = 10
    val y:Long = x

    //2、高精度转低精度[Long->Int]: toXXX方法
    val z:Int = y.toInt

    //1、数字转字符串: 拼接、toString
    val s = z.toString

    val s2 = z+""

    val s3 = s"${z}"

    println(s)
    println(s2)
    println(s3)

    //2、字符串转数字: toXXX方法
    val a = s3.toInt
    println(a)

    val s4 = "10.0"
    //println(s4.toInt)
    println(s4.toDouble)
  }
}
