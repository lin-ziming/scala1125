package com.atguigu.chapter05

object $10_Filter {

  /**
    * 2、根据指定规则对数组过滤
    * 数据: Array[Int](1,4,3,6,7,10,20)
    * 规则: 过滤出偶数数据
    * 结果: Array(4,6,10,20)
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val arr = Array[Int](1,4,3,6,7,10,20)

    val func = (x:Int) => x%5==0
    println(filter(arr,func).toList)
    //直接传递函数值
    println(filter(arr, (x:Int) => x%5==0 ).toList)
    //省略函数的参数类型
    println(filter(arr, (x) => x%5==0 ).toList)
    //函数只有一个参数,参数列表的()可以省略
    println(filter(arr, x => x%5==0 ).toList)
    //函数的参数在函数体中只使用了一次可以用_代替
    println(filter(arr, _%5==0 ).toList)

  }

  def filter( datas:Array[Int] ,func: Int => Boolean ) ={

    for(element<- datas if( func(element) ) ) yield{
        element
    }
  }
}
