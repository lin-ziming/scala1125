package com.atguigu.chapter07

object $13_CollectionAndCollection {

  def main(args: Array[String]): Unit = {

    val list = List(1,3,5,7,9,2,4,1,5,3)
    //去重 *********
    println(list.distinct)

    //删除前N个元素,保留剩余所有元素
    println(list.drop(3))

    //删除后N个元素,保留剩余所有元素
    println(list.dropRight(3))

    //获取前N个元素 *********
    println(list.take(3))

    //获取后N个元素
    println(list.takeRight(3))

    //获取第一个元素 *********
    println(list.head)

    //获取最后一个元素 *********
    println(list.last)

    //获取除开第一个元素的所有元素
    println(list.tail)

    //获取除开最后一个元素的所有元素 *********
    println(list.init)

    //反转 *********
    println(list.reverse)

    //获取指定角标范围的所有元素 *********
    //slice(开始角标,结束角标) [结果集合不包含结束角标的元素]
    println(list.slice(3, 3))

    //滑窗 *********
    //sliding(size,step): 滑窗
    //  size: 代表窗口的大小
    //  step: 代表滑动的长度[上下两个窗口的间隔元素个数]
    val it = list.sliding(3,2)
    println(it.toList)

    //交集: 两个集合共同的元素
    val list2 = List(1,2,3,4,5)
    val list3 = List(4,5,6,7,8)
    println(list2.intersect(list3))
    //差集: A差B的结果就是保留A中有B中没有的数据
    println(list2.diff(list3))
    //并集: 两个集合所有元素合并
    println(list2.union(list3))

    //拉链
    val list4 = List("aa","bb","cc","dd","ee")
    val list5 = List(11,33,22,55)
    val list6 = list4.zip(list5)
    println(list6)

    //反拉链
    println(list6.unzip)

    //将元素与角标拉链
    println(list4.zipWithIndex)

  }
}
