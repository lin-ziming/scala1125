package com.atguigu.chapter07

object $05_ImmutableSet {

  /**
    * Set特性: 无序不重复
    * 不可变Set的创建
    *       通过apply方法: Set[元素类型](初始元素,...)
    */
  def main(args: Array[String]): Unit = {

    //通过apply方法: Set[元素类型](初始元素,...)
    val s1 = Set[Int](1,4,3,2,1,5)
    println(s1)

    //添加元素
    val s2 = s1.+(10)
    println(s2)

    val s3 = s1.++(List(11,44,33,22))
    println(s3)

    val s4 = s1.++:(List(11,44,33,22))
    println(s4)

    //删除
    val s5 = s1.-(1)
    println(s5)

    val s6 = s1.--(List(2,3,4))
    println(s6)

    //不能获取角标的元素


  }
}
