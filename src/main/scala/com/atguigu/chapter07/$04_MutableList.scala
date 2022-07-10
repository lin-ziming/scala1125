package com.atguigu.chapter07

import scala.collection.mutable.ListBuffer

object $04_MutableList {

  /**
    * 可变List的创建
    *     1、通过apply方法: ListBuffer[元素类型](初始元素,...)
    *     2、通过new的方式: new ListBuffer[元素类型]()
    *
    */
  def main(args: Array[String]): Unit = {


    //1、通过apply方法: ListBuffer[元素类型](初始元素,...)
    val list1 = ListBuffer[Int](1,3,2,5)
    // 2、通过new的方式: new ListBuffer[元素类型]()
    val list2 = new ListBuffer[Int]()
    println(list1)
    println(list2)

    //添加元素
    val list3 = list1.+:(10)
    println(list3)

    val list4 = list1.:+(30)
    println(list4)

    list1.+=(40)
    println(list1)

    list1.+=:(50)
    println(list1)

    val list5 = list1.++(List(11,22,33))
    println(list5)

    val list6 = list1.++:(List(24,25,26))
    println(list6)

    list1.++=(List(66,77,88))
    println(list1)

    list1.++=:(List(100,200,300))
    println(list1)

    //删除
    val list7 = list1.-(1)
    println(list7)

    list1.-=(100)
    println(list1)

    val list8 = list1.--(List(1, 3, 2, 5))
    println(list8)

    list1.--=(List(200,300,50))
    println(list1)

    //获取指定角标数据
    println(list1(0))

    //修改指定角标数据
    list1(0) = 100
    println(list1)
    list1.update(1,300)
    println(list1)
  }
}
