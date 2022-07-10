package com.atguigu.chapter08

object $10_MatchFor {

  def main(args: Array[String]): Unit = {
    val map = Map[String,Int]("aa"->10,"bb"->20)

    for( ( k,v ) <- map ){
      println(k)
      println(v)
    }
  }

}
