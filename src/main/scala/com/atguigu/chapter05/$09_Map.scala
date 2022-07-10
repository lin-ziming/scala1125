package com.atguigu.chapter05

object $09_Map {

  /**
    * 1、根据指定规则对数组中每个元素操作返回结果
    * 数据: Array("hello","java","spark","hadoop","flume")
    * 规则: 获取每个元素的长度[动态]
    * 结果: Array(5,4,5,6,5)
    *
    */
  def main(args: Array[String]): Unit = {

    val arr = Array[String]("hello","java","spark","hadoop","flume")

    val func = (x:String) => x.length
    val func2 = (x:String) => x.charAt(0)
    println(map(arr,func2).toList)


  }

  def map( datas:Array[String] ,func: String => Any) = {

    for(element<- datas ) yield {
      //element.length
      //element.charAt(0)
      func(element)
    }
  }

}
