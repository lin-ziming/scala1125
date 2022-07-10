package com.atguigu.chapter08

object $09_MatchParam {
  //变量声明的模式匹配
  //   变量声明的时候是会进行模式匹配的,=前面的是模式匹配的case条件, =后面的是待匹配的对象
  def main(args: Array[String]): Unit = {

    val t = ("lisi",20,"shenzhen")

    println(t._1)
    println(t._2)
    println(t._3)

    //变量声明的模式匹配
    val (name,age,_) = ("lisi",20,"shenzhen")
    println(name)
    println(age)
    //println(address)

    val Array(x,_,_,_*) = Array(1,2,3,4)
    println(x)

    val y:String = "lisi"

    //val a :: b :: Nil = List(1,2,3)
    val a :: b :: tail = List(1,2,3)
  }
}
