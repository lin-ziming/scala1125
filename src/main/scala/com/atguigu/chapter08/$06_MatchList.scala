package com.atguigu.chapter08

object $06_MatchList {

  def main(args: Array[String]): Unit = {

    val list = List(1,4,3,2)

    //第一种方式
    list match {
      case List(x) => println("匹配列表只有一个元素....")
      case List(x,y) => println("匹配列表只有两个元素....")
      case List(x,y,_*) => println("匹配列表至少两个元素....")
    }

    //第二种方式
    list match {

      case x :: Nil => println("匹配列表只有一个元素")
      case x :: y :: Nil => println("匹配列表只有两个元素")
      case x :: y :: tail => println(s"匹配列表至少两个元素 ${tail}")
    }
  }
}
