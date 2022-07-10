package com.atguigu.chapter05

import java.util

object $11_groupBy {

  /**
    * 3、根据指定规则对数组数据分组 [map可以使用java的map]
    * 数据: Array[String]("zhangsan man shenzhen","lisi woman beijing","zhaoliu man beijing","lilei woman guangzhou")
    * 规则: 按照性别分组
    * 结果: Map( man -> List("zhangsan man shenzhen", "zhaoliu man beijing"), woman -> List("lisi woman beijing","lilei woman guangzhou" ) )
    */
  def main(args: Array[String]): Unit = {

    val arr = Array[String]("zhangsan man shenzhen","lisi woman beijing","zhaoliu man beijing","lilei woman guangzhou")

    val func = (x:String) => x.split(" ")(2)
    println(groupBy(arr,func))
    //直接传递函数值
    println(groupBy(arr,(x:String) => x.split(" ")(2)))
    //省略函数参数类型
    println(groupBy(arr,(x) => x.split(" ")(2)))
    //函数只有一个参数,可以省略参数列表的()
    println(groupBy(arr,x => x.split(" ")(2)))
    //函数的参数在函数体中只使用了一次可以用_简化
    println(groupBy(arr,_.split(" ")(2)))

  }

  def groupBy(datas:Array[String],func: String => String) = {

    //创建Map容器
    val map = new util.HashMap[String,util.List[String]]()

    //遍历
    for(element<- datas){
      //获取分组的key
      val key = func(element)

      //判断key在map容器中是否存在,如果存在则将当前元素添加到key对应的value中
      if( map.containsKey(key) ){

        val list = map.get(key)

        list.add(element)

      }
      //如果不存在,则添加k-v键值对到map容器中
      else{

        val list = new util.ArrayList[String]()
        list.add(element)
        map.put(key,list)
      }
    }

    map

  }
}
