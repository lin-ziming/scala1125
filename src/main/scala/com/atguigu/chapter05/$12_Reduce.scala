package com.atguigu.chapter05

object $12_Reduce {

  /**
    * 4、根据指定规则对数组所有元素聚合
    * 数据: Array[Int](10,30,20,50,100)
    * 规则: 求和
    * 结果: 210
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr =  Array[Int](10,30,20,50,100)

    val func = (agg:Int,curr:Int)=> agg+curr
    println(reduce(arr,func))
    //直接传递函数值
    println(reduce(arr, (agg:Int,curr:Int)=> agg+curr))
    //省略函数参数类型
    println(reduce(arr, (agg,curr)=> agg+curr))
    //函数的参数在=>右边只使用了一次,用_代替
    println(reduce(arr, _+_))
  }

  def reduce(datas:Array[Int],func: (Int,Int) => Int)={

    var sum = datas(0)

    for( index<- 1 until datas.length ) {

      sum = func(sum,datas(index))
    }

    sum
  }
}
