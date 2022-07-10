package com.atguigu.chapter07

import scala.collection.mutable

object $06_MutableSet {

  /**
    * 可变Set的创建: mutable.Set[元素类型](初始元素,...)
    *
    */
  def main(args: Array[String]): Unit = {

    //可变Set的创建: mutable.Set[元素类型](初始元素,...)
    val s1 = mutable.Set[Int](1,4,3,2,1,5)
    println(s1)

    //添加元素
    val s2 = s1.+(10)
    println(s2)

    s1.+=(11)
    println(s1)

    val s3 = s1.++(List(22,66,44,33))
    val s4 = s1.++:(List(22,66,44,33))
    println(s3)
    println(s4)

    s1.++=(List(22,66,44,33))
    println(s1)

    //删除
    val s5 = s1.-(1)
    println(s5)

    s1.-=(11)
    println(s1)

    val s6 = s1.--(List(1, 5, 2, 3, 4))
    println(s6)

    s1.--=(List(33,66))
    println(s1)

    //
    s1.update(10,true)
    println(s1)
  }
}
