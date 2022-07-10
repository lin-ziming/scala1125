package com.atguigu.chapter08

import scala.io.StdIn

object $02_MatchIf {

  /**
    * 模式匹配守卫语法
    *     变量 match {
    *         case 条件 if(布尔表达式) => ....  //必须满足case条件与后面的if条件才算是匹配上该分支
    *         ....
    *         case x => ...
    *     }
    *
    */
  def main(args: Array[String]): Unit = {

    val line = StdIn.readLine("请输入一个句子:")

    line match  {

      case x if(x.contains("hadoop")) => println("包含hadoop...")
      case a if(a.contains("spark")) => println("包含spark...")
      case x if(x.contains("flume")) => println("包含flume...")
      case _  => println("其他....")
    }
  }
}
