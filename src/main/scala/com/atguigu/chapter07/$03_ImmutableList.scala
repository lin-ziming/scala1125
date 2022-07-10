package com.atguigu.chapter07

object $03_ImmutableList {

  /**
    * 不可变List的创建方式
    *     1、通过apply方法创建: List[Int](初始元素,初始元素,...)
    *     2、通过 :: 方法创建: 初始元素 :: 初始元素 :: ... :: 不可变List/Nil
    *     Nil是空的不可变List,Nil可以用作给不可变List变量赋予初始值,在赋予初始值的时候必须指定变量的类型
    *     :: 最右边必须是Nil或者不可变List
    * :: 与 ::: 的区别
    *     :: 是相当于 +:
    *     ::: 是相当于 ++:
    */
  def main(args: Array[String]): Unit = {

    // 1、通过apply方法创建: List[Int](初始元素,初始元素,...)
    val list1 = List[Int](1,3,2,5)

    //2、通过 :: 方法创建: 初始元素 :: 初始元素 :: ... :: 不可变List/Nil
    val list2 = 4 :: 6 :: 10 :: Nil
    println(list1)
    println(list2)
    println(Nil)

    var list3:List[Int] = Nil
    list3 = list2

    //添加元素
    val list4 = list1.+:(10)
    println(list4)

    val list5 = list1.:+(20)
    println(list5)

    val list6 = list1.::(30)
    println(list6)

    val list7 = list1.++(Array(11,14,12))
    println(list7)

    val list18 = list1.++:(List(21,24,26))
    println(list18)

    val list19 =  List(44,47,49) ::: list1
    println(list19)

    //删除

    //获取指定角标元素
    println(list19(0))

    //修改指定角标元素
    //list19(0) = 444
    println(list19)

    val list20 = list19.updated(0,444)
    println(list20)
    println(list19)
  }
}
