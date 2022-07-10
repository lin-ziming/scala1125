package com.atguigu.chapter07

import scala.collection.mutable

object $09_MutableMap {

  /**
    * 可变Map的创建
    *     通过apply方法创建: mutable.Map[K的类型,V的类型]( k->v,(k,v),... )
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //通过apply方法创建: mutable.Map[K的类型,V的类型]( k->v,(k,v),... )
    val map = mutable.Map[String,Int]("dd"->10,"aa"->20,"cc"->30,"tt"->40)
    println(map)

    //添加元素
    val map2 = map.+( "ac"->22 )
    println(map2)

    map.+=( "dc"->33 )
    println(map)

    val map3 = map.++(List( "tc"->40,"pc"->50,"ff"->11,"lc"->60 ,"cc"->70))
    val map4 = map.++:(List( "tc"->40,"pc"->50,"ff"->11,"lc"->60,"cc"->70 ))
    val map5 = map.++=(List( "tc"->40,"pc"->50,"ff"->11,"lc"->60,"cc"->70 ))
    println(map3)
    println(map4)
    println(map5)

    //删除元素
    val map6 = map5.-("cc")
    println(map6)

    map5.-=("dc")
    println(map5)

    val map7 = map5.--(List("tc","ff"))
    println(map7)

    map5.--=(List("ff","dd","pc"))
    println(map5)

    //根据key获取value值
    println(map5.getOrElse("cc", -1))
    //获取所有key
    println(map5.keys)
    //获取所有的value
    println(map5.valuesIterator.toList)

    //修改key对应的value值
    map5("cc") = 700
    println(map5)

  }
}
