package com.atguigu.chapter07

import scala.io.Source

object $16_WordCount {

  def main(args: Array[String]): Unit = {

    //1、读取文件
    val datas = Source.fromFile("datas/wc.txt").getLines().toList
    //List(
    // "hello spark hello",
    // "python scala spark",
    // "spark kafka flume",
    // "flume kafka scala",
    // )

    //2、切割+炸开
    val splitsList = datas.flatMap(x=>x.split(" "))
    //List(hello,spark,hello,python,scala,....)

    //3、按照单词分组
    val groupedMap = splitsList.groupBy(x=>x)
    //Map(
    //    hello -> List( hello,hello )
    //    spark -> List( spark,spark,spark )
    //    ......
    // )
    //4、统计每个单词的个数
    val result = groupedMap.map(x=>{
      //x =  hello -> List( hello,hello )
      (x._1 , x._2.size)
    })

    //Map( hello->2,spark->3,python->1,scala->2,kafka->2,flume->2)
    result.foreach(println)

    //Source.fromFile("datas/wc.txt").getLines()
    //  .toList
    //  .flatMap(_.split(" "))
    //  .groupBy(x=>x)
    //  .map(x=>(x._1,x._2.size))
    //  .foreach(println(_))
  }
}
