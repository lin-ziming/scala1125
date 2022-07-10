package com.atguigu.chapter07

object $17_WordCount2 {

  def main(args: Array[String]): Unit = {


    val tupleList = List( ("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    //1、切割+炸开【给每个单词初始次数】
    val splitList = tupleList.flatMap(x=>{
      //x = ("Hello Scala Spark World", 4)
      val arr = x._1.split(" ")
      //Array(Hello,Scala,Spark,World)
      arr.map(y=> ( y,x._2 ))
    })

    //List(Hello->4,Scala->4,Spark->4,World->4,Hello->3,Scala->3,Spark->3,Hello->2,Scala->2,Hello->1)
    //2、按照单词分组
    val groupedMap = splitList.groupBy(x=>x._1)
    //Map(
    //    Hello-> List(Hello->4,Hello->3,Hello->2,Hello->1 )
    //    Scala-> List(Scala->4,Scala->3,Scala->2 )
    //    ........
    // )

    //3、对每个组统计单词个数
    val result = groupedMap.map(x=>{
      //x = Hello-> List(Hello->4,Hello->3,Hello->2,Hello->1 )
      //第一种聚合
      //val r = x._2.reduce((agg,curr)=> (agg._1, agg._2+curr._2 ) )
      //r
      //第二种聚合
      val list = x._2.map(z=> z._2)
      (x._1, list.sum )
    })
    //4、结果打印
    result.foreach(println)
  }
}
