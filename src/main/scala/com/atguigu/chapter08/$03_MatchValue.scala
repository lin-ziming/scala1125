package com.atguigu.chapter08

import scala.io.StdIn

object $03_MatchValue {

  /**
    * 匹配值语法
    *     变量 match {
    *         case 值1 => ....
    *         case 值2 => ....
    *         ......
    *         case x => ...
    *     }
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine("请输入一个单词:")

    val Xx = "kafka"

    val result = line match {

      case "hadoop" => {
        println("输入是hadoop...")
        10
      }
      case "spark" => {
        println("输入是spark...")
        20
      }
      // =>后面的块表达式的{}可以省略的
      case "flume" =>
        println("输入是flume...")
        30


      //如果需要使用外部变量的值作为匹配条件,此时外部变量名首字母必须大写
      case Xx => {
        println("输入的是kafka...")
        -1
      }
      //相当于switch的defafult语句,
      //case x => {
      //  println("其他...")
      //}
      //case后面的变量x如果在=>右边不使用可以用_代替
      case x => {
        println("其他...")
        0
      }
    }

    println(result)
  }
}
