package com.atguigu.chapter07

object $07_Tuple {

  class Region(val name:String,val school:School)

  class School(val name:String, val clazz:Clazz)

  class Clazz(val name:String, val stu:Student)

  class Student(val name:String,val age:Int)
  /**
    * 元组的创建
    *     1、通过()方式创建: (初始元素,...) [此种方式可以创建所有元组]
    *     2、通过->方式创建: K -> V [此种方式只能用于创建二元元组]
    *           scala的二元元组表示KV键值对
    * 元组最多只能存放22个元素
    * 元组一旦创建,元素个数与元素都不可以改变
    * 元素可以通过 元组名._N 获取元素[N是元组的角标,元素角标从1开始]
    */
  def main(args: Array[String]): Unit = {

    // 1、通过()方式创建: (初始元素,...) [此种方式可以创建所有元组]
    val t1 = ("lisi",20,"shenzhen")

    //2、通过->方式创建: K -> V [此种方式只能用于创建二元元组]
    val t2 = "zhangsan" -> 20
    println(t1)
    println(t2)

    println(t1._1)
    println(t1._2)
    println(t1._3)

    //使用元组封装数据
    val list = List("1 zhagnsan 20 shenzhen","2 wagnwu 30 beijing","3 zhaoliu 44 beijing")
    val list2 = for(element<- list ) yield {
      val arr = element.split(" ")
      val region = arr(3)
      val age = arr(2).toInt
       //region -> age
      (region,age)
    }


    val list3 = List(
      new Region("宝安区",new School("宝安中学",new Clazz("法师班",new Student("安其拉",18)))),
      new Region("宝安区",new School("宝安中学",new Clazz("法师班",new Student("王昭君",18)))),
      new Region("宝安区",new School("宝安中学",new Clazz("法师班",new Student("小乔",18)))),
      new Region("宝安区",new School("宝安中学",new Clazz("法师班",new Student("甄姬",18))))
    )

    val list4 = List(
      ("宝安区",("宝安中学",("法师班",("安其拉",18)))),
      ("宝安区",("宝安中学",("法师班",("王昭君",18)))),
      ("宝安区",("宝安中学",("法师班",("小乔",18)))),
      ("宝安区",("宝安中学",("法师班",("甄姬",18))))
    )

    for(element<- list4){
      println(element._2._2._2._1)
    }



  }
}
