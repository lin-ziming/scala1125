package com.atguigu.chapter07

object $12_CollectionFields {

  def main(args: Array[String]): Unit = {

    val list = List(1,4,3,2,6,7)

    //判断集合是否包含某个元素
    println( list.contains(60) )

    //获取集合长度
    println(list.length)
    println(list.size)

    //将集合所有元素拼接成字符串展示
    println(list.mkString("#"))

    //判断集合是否为空
    println(list.isEmpty)

    //将集合转成迭代器
    val it = list.toIterator
    //Iterator: 只能使用一次的迭代器
    //Iterable: 可以重复使用的迭代器

    for(i<- it){
      println(s"i=${i}")
    }

    for(j<- it){
      println(s"j=${j}")
    }


    val it2 = list.toIterable

    for(k<- it2){
      println(s"k=${k}")
    }

    for(t<- it2){
      println(s"t=${t}")
    }
  }
}
