package com.atguigu.chapter07

object $15_CollectionHightFunction {

  def main(args: Array[String]): Unit = {

    //map(func: 集合元素类型 => B ) : 一对一映射[原集合一个元素计算得到新集合一个结果] *********
    //  map里面的函数是针对集合每个元素操作,元素有多少个,函数就执行多少次
    //  map会生成一个新集合,新集合元素个数 = 原集合元素个数
    //  map的使用场景: 用于数据类型转换/值的转换[一对一]
    val list = List("hello","java","spark","hadoop")
    val list2 = list.map(x=> x.length)
    val list3 = list.map(x=> x.substring(2))
    println(list2)
    println(list3)
    println("---------------------------------------------------------------------")

    //foreach(func: 集合元素类型=> B):Unit  : 遍历  *********
    //  foreach里面的函数是针对集合每个元素操作,元素有多少个,函数就执行多少次
    //  foreach没有返回值
    //  map与foreach的区别:
    //      map会生成新的集合,相当于有yield关键字的for循环
    //      foreach没有返回值,相当于没有yield关键字的for循环
    list.foreach( x=> println(x) )
    list.foreach( println(_) )
    //方法就是函数
    list.foreach( println )
    println("---------------------------------------------------------------------")

    //flatten: 压平
    //flatten针对是集合嵌套集合的数据类型
    //flatten是将第二层集合压掉
    //flatten生成的集合的元素个数一般>=原集合元素个数
    //flatten的使用场景: 一对多

    val list4 = List[List[Int]] (
      List(1,2),
      List(3,4),
      List(5,6)
    )
    val list5 = list4.flatten
    println(list5)

    val list6 = List[List[List[Int]]](
      List(
        List(1,2),
        List(3,4)
      ),
      List(
        List(5,6),
        List(6,7)
      )
    )
    val list7 = list6.flatten
    println(list7)

    //list5.flatten
    println(list.flatten)
    println("---------------------------------------------------------------------")

    //flatMap(func: 集合元素类型=> 集合 ) = map + flatten *********
    // flatMap里面的函数是针对集合每个元素处理,元素有多少个,函数就执行多少次
    // flatMap生成的集合中元素的个数一般是>=原集合元素个数
    // flatMap的使用场景: 一对多场景

    val list8 = List("hello java spark","scala hadoop flatten","spark hadoop flume")

    val list9 = list8.map(x=> x.split(" "))

    println(list9.flatten)
    println("---------------------------------------------------------------------")

    //filter(func: 集合元素类型=> Boolean): 按照指定条件过滤 *********
    // filter里面函数是针对集合每个元素操作,集合有多少元素,函数就调用多少次
    // filter保留的函数返回值为true的数据
    val list10 = List(1,4,3,2,5,7,9,10)
    val list11 = list10.filter(x=> x%2==0 )
    println(list11)
    println("---------------------------------------------------------------------")

    //groupBy(func: 集合元素类型 => B ): 按照指定字段分组 *********
    // groupBy里面的函数是针对集合每个元素操作
    // groupBy是根据函数的返回值对集合所有元素分组
    // groupBy生成是Map集合，Map中元素的Key是函数的返回值,Map中元素的Value是Key对应原集合中的所有的元素
    val list12 = List( ("lisi","man","beijing"),("wangwu","woman","shenzhen"),("zhaoliu","man","shanghai"),("lilei","man","shenzhen") )
    val list13 = list12.groupBy(x=> x._2)
    println(list13)
    val list14 = list13.map(x=> (x._1, x._2.size))
    println(list14)
    println("---------------------------------------------------------------------")

    println("--------------------------------聚合---------------------------------")
    //reduce(func: (集合元素类型,集合元素类型)=>集合元素类型 ): 对集合所有元素从左向右聚合 *********
    // reduce里面的函数第一个参数代表上一次聚合结果,第一次聚合的时候,该参数的初始值 = 集合第一个元素
    // reduce里面的函数第二个参数代表当前要聚合的元素
    val list15 = List(10,40,30,20,50)
    val r = list15.reduce( (agg,curr)=> {
      println(s"agg=${agg} curr=${curr}")
      agg+curr
    } )
    println(r)

    println("---------------------------------------------------------------------")
    //reduceRight(func: (集合元素类型,集合元素类型)=>集合元素类型 ): 对集合所有元素从右向左聚合
    // reduceRight里面的函数第一个参数代表当前要聚合的元素
    // reduceRight里面的函数第二个参数代表上一次聚合结果,第一次聚合的时候,该参数的初始值 = 集合最后一个元素
    list15.reduceRight((curr,agg)=>{
      println(s"agg=${agg} curr=${curr}")
      agg+curr
    })

    println("---------------------------------------------------------------------")
    //fold(默认值)(func: (集合元素类型,集合元素类型)=>集合元素类型 ): 对集合所有元素从左向右聚合
    // fold里面的函数第一个参数代表上一次聚合结果,第一次聚合的时候,该参数的初始值 = 默认值
    // fold里面的函数第二个参数代表当前要聚合的元素
    list15.fold(0)( (agg,curr)=>{
      println(s"agg=${agg} curr=${curr}")
      agg+curr
    } )

    println("---------------------------------------------------------------------")
    //foldRight(默认值)(func: (集合元素类型,集合元素类型)=>集合元素类型 ): 对集合所有元素从右向左聚合
    //foldRight里面的函数第一个参数代表当前要聚合的元素
    //foldRight里面的函数第二个参数代表上一次聚合结果,第一次聚合的时候,该参数的初始值 = 默认值
    list15.foldRight(0)((curr,agg)=>{
      println(s"agg=${agg} curr=${curr}")
      agg+curr
    })
  }
}
