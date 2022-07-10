package com.atguigu.chapter07

object $18_ParCollection {

  /**
    * 并行集合: 利用多线程的优势将集合元素并行处理
    *     普通集合转成并行集合: 集合名.par
    */
  def main(args: Array[String]): Unit = {

    val list = List(1,3,5,7,10)

    list.foreach(x=>{
      println(s"${Thread.currentThread().getName} -- ${x}")
    })

    //转成并行集合
    val parList = list.par

    parList.foreach(x=>{
        println(s"${Thread.currentThread().getName} -- ${x}")
      })

  }
}
