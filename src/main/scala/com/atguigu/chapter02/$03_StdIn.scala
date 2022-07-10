package com.atguigu.chapter02

import scala.io.{Source, StdIn}

object $03_StdIn {

  /**
    * scala从控制台读取数据: StdIn.readLine/readInt/readBoolean/readXXX
    *
    * scala从文件读取数据: Source.fromFile(path).getLines()
    *
    */
  def main(args: Array[String]): Unit = {

    val line = StdIn.readLine("请输入一个句子:")
    println(line)

    val lines = Source.fromFile("d:/presidential_polls.csv","utf-8").getLines()


    println(lines.toList)
  }
}
