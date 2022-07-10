package com.atguigu.chapter07

object $14_CollectionLowerFunction {

  def main(args: Array[String]): Unit = {

    val list = List(10,20,20,50)

    val x = 10
    //获取最小值  ***********
    println(list.min)

    //获取最大值 ***********
    println(list.max)

    //求和 ***********
    println(list.sum)

    //根据指定字段获取最大值: maxBy(func: 集合元素类型=>B) ***********
    // maxBy里面的函数是针对集合每个元素操作
    // maxBy后续是根据函数的返回值后去最大的元素
    val list2 = List( ("lisi",16,1800),("wangwu2",30,5000),("alibaba",18,10000),("wangwu",50,5000) )

    //println(list2.max)
    val func = (x:(String,Int,Int)) => x._3
    println(list2.maxBy(func))
    //可以直接传递函数值
    println(list2.maxBy( (x:(String,Int,Int)) => x._3 ))
    //省略函数参数类型
    println(list2.maxBy( (x) => x._3 ))
    //如果函数只有一个参数,参数列表的()可以省略
    println(list2.maxBy( x => x._3 ))
    //函数的参数在函数体中只使用了一次,可以用_简化
    println(list2.maxBy( _._3 ))

    //使用maxBy实现max功能
    println(list.maxBy( x => x))


    //根据指定字段获取最小值
    // minBy(func: 集合元素类型 => B ) ***********
    // minBy里面的函数是针对集合每个元素操作
    // minBy后续是根据函数的返回值获取最小的元素
    println(list2.min)
    println(list2.minBy(x => x._2))
    println(list2.minBy(_._2))

    //排序
    //sorted: 按照集合元素本身排序[默认升序]
      //升序
    println(list.sorted)
      //降序
    println(list.sorted.reverse)

    //println(list2.sorted)
    //sortBy(func: 集合元素类型=> B ): 按照指定字段排序[默认升序] ***********
    //  sortBy里面的函数是针对集合每个元素操作
    //  sortBy后续是按照函数的返回值对集合所有元素排序
    println(list2.sortBy(x => x._2))
    println(list2.sortBy(_._2))
    //sortBy实现sorted功能
    println(list.sortBy(x => x))

    //实现自定义升降序
    val ordering = new Ordering[Int]{
      override def compare(x: Int, y: Int): Int = {
        if(x<y) 1
        else if(x==y) 0
        else -1
      }
    }
    println(list2.sortBy(_._2)(ordering))
    println(list2.sortBy(_._2).reverse)

    //sortWith(lt: (集合元素类型,集合元素类型)=>Boolean) : 通过指定排序规则排序
    //  第一个参数<第二个参数是升序
    //  第一个参数>第二个参数是降序
    println(list.sortWith((x, y) => x < y))
    println(list.sortWith((x, y) => x > y))

  }
}
