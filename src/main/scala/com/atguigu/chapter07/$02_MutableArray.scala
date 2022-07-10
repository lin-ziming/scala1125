package com.atguigu.chapter07

import scala.collection.mutable.ArrayBuffer

object $02_MutableArray {

  /**
    * 可变数组的创建
    *     1、new的方式创建: new ArrayBuffer[元素类型]()
    *     2、apply方法创建: ArrayBuffer[元素类型](初始元素,....)
    *
    */
  def main(args: Array[String]): Unit = {

    //1、new的方式创建: new ArrayBuffer[元素类型]()
    val arr = new ArrayBuffer[Int]()
    //2、apply方法创建: ArrayBuffer[元素类型](初始元素,....)
    val arr2 = ArrayBuffer[Int](1,5,3,9,10)

    println(arr)
    println(arr2)

    //添加元素
    //添加单个元素
    val arr3 = arr2.+:(12)
    println(arr3)
    println(arr2)

    val arr4 = arr2.:+(15)
    println(arr4)

    arr2.+=(16)
    println(arr2)

    arr2.+=:(17)
    arr2.+=:(1)
    println(arr2)

    //添加一个集合所有元素
    val arr5 = arr2.++(Array[Int](21,24,25,26))
    println(arr5)

    val arr6 = arr2.++:(Array[Int](31,33,35,37))
    println(arr6)

    //删除
    val arr7 = arr2.-(1)
    println(arr7)
    println(arr2)

    arr2.-=(3)
    println(arr2)

    val arr8 = arr2.--(Array[Int](1,1,5))
    println(arr8)
    println(arr2)
    arr2.--=(Array[Int](9,1,1))
    println(arr2)

    //获取角标元素
    println(arr2(0))

    //修改角标对应的元素
    arr2(0)=170
    println(arr2)

    //可变转不可变
    val arr9 = arr2.toArray
    println(arr9.toList)


  }
}
