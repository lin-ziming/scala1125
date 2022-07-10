package com.atguigu.chapter08

import scala.io.StdIn

object $01_MatchDefined {

  /**
    * 模式匹配的语法
    *     变量 match {
    *         case 条件 => {.....}   //每个条件=>后面块表达式的{}可以省略
    *         case 条件 => {....}
    *         .....
    *         case x => {...}  //相当于其他情况
    *     }
    *模式匹配有返回值,返回值是符合条件的分支的块表达式的结果值
    */
  def main(args: Array[String]): Unit = {

    val line = StdIn.readLine("请输入一个单词:")

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
        println("xxxxx")
        println("yyyyyyyyyyyy")
        println("输入是flume...")
        30


      //相当于switch的defafult语句,
      //case x => {
      //  println("其他...")
      //}
      //case后面的变量x如果在=>右边不使用可以用_代替
      case _ => {
        println("其他...")
        -1
      }
    }

    println(result)
  }
}
