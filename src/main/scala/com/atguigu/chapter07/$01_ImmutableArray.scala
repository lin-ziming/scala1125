package com.atguigu.chapter07

object $01_ImmutableArray {

  /**
    * 不可变数组创建
    *     1、通过new方式: new Array[元素类型](长度)
    *     2、通过apply方法: Array[元素类型](初始元素,....)
    *
    *集合常用添加/删除方法的区别:
    *     1、带+与带-方法的区别:
    *         带+的方法是添加元素
    *         带-的方法是删除元素
    *     2、一个+/-与两个+/-的区别
    *         一个+/-是添加/删除单个元素
    *         两个+/-是添加/删除一个指定集合的所有元素
    *     3、冒号在前、冒号在后以及不带冒号的区别
    *         冒号在后是将元素添加到集合最前面
    *         冒号在前是将元素添加到集合最后面
    *         不带冒号是将元素添加到集合最后面
    *     4、带=与不带=的区别
    *         不带=是生成新集合,原集合没有改变
    *         带=是修改原集合
    *      5、update与updated的区别
    *         update是直接修改原集合元素
    *         updated是生成新集合,原集合没有改变
    *
    */
  def main(args: Array[String]): Unit = {

    //1、通过new方式: new Array[元素类型](长度)
    val arr1 = new Array[Int](10)
    println( arr1.toList )

    //2、通过apply方法: Array[元素类型](初始元素,....)
    val arr2 = Array[Int](1,4,3,6)
    println(arr2.toList)

    //添加单个元素
    val arr3 = arr2.+:(10)
    println(arr3.toList)
    println(arr2.toList)


    val arr4 = arr2.:+(20)
    println(arr4.toList)

    //添加一个集合所有元素
    val arr5 = arr2.++( Array[Int](11,44,33,22,55) )
    println(arr5.toList)

    val arr6 = arr2.++:(Array[Int](111,55,333))
    println(arr6.toList)

    //删除

    //获取元素: 数组名(角标)
    println(arr6(0))

    //修改指定角标的值
    arr6(0) = 100
    println(arr6.toList)

    //不可变转可变
    val buffer = arr6.toBuffer
    println(buffer)

    //创建二维数组
    val array = Array.ofDim[Int](4,3)
    println( array(0).length )
    println( array.length )
  }
}
