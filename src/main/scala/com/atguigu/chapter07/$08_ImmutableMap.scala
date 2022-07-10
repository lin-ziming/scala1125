package com.atguigu.chapter07

object $08_ImmutableMap {

  /**
    * 不可变Map的创建:
    *       通过apply方法: Map[K的类型,V的类型]( (K,V),K->V,... )
    *
    * scala Map获取key的value值: getOrElse(key,默认值) 【key如果在map中存在则返回value值,如果不存在则返回默认值】
    *     Option: 提醒外部当前结果有可能为空需要处理
    *         Some: 代表结果不为空,可以通过get方法取出结果
    *         None: 代表结果为空
    *
    */
  def main(args: Array[String]): Unit = {

    //通过apply方法: Map[K的类型,V的类型]( (K,V),K->V,... )
    val map = Map[String,Int]("cc"->20 , ("aa",10),"dd"->30,"bb"->40,"aa"->50)
    println(map)

    //添加元素
    val map2 = map.+( "tt"->60 )
    println(map2)

    val map3 = map.++(List( "ac"->10,"dc"->30,"dt"->50 ))
    println(map3)

    val map4 = map.++:(List( "ac"->10,"dc"->30,"dt"->50 ))
    println(map4)

    //删除
    val map5 = map4.-("ac")
    println(map5)

    val map6 = map4.--(List("dc","dt","cc"))
    println(map6)

    //根据key获取value值
    //println(map6("bb1"))
    //println(map6.get("bb1"))
    //println(map6.get("bb").get)
    println(map6.getOrElse("bb", -1))
    println(map6.getOrElse("bb1", -1))
    //获取所有的key
    println(map6.keySet)
    //获取所有的value
    println(map6.values)

    //修改map的value值
    //map("bb") = 400
    val map7 = map.updated("bb",4000)
    println(map7)
  }
}
