package com.atguigu.chapter10


import com.atguigu.chapter01.$01_Implicits._

object $01_ImplicitMethod {

  class Animal{
    val name = "lisi"
  }

  class Dog{

    val color = "red"
  }
  /**
    * 隐式转换分为三种
    *     隐式转换方法: scala悄悄调用方法将一个类型转为另一个类型
    *         语法: implicit def 方法名(参数名: 待转换类型):目标类型 = {...}
    *         隐式转换方法的调用时机
    *             1、当前类型与目标类型不一致
    *             2、当对象使用来不属于自己的方法/属性的时候
    *     隐式参数
    *     隐式类
    *隐式转换的解析机制[如何找到隐式转换]
    *     1、首先从当前作用域和父作用域查询是否有符合要求的隐式转换,如果有则直接使用,如果没有报错
    *     2、如果隐式转换放在其他的object/class中,需要导入之后才能使用
    *           1、如果隐式转换放在object中,后续需要通过 import object名称.隐式转换名称 /import object名称._ 导入
    *           2、如果隐式转换放在class中,后续需要通过 import 对象名.隐式转换名称 /import 对象名._ 导入
    *     如果object/class中有多个隐式转换都符合要求,此时必须通过 import object名称.隐式转换名称 / import 对象名.隐式转换名称 形式明确指定导入哪个隐式转换。
    */
  def main(args: Array[String]): Unit = {

    //1、如果隐式转换放在object中,后续需要通过 import object名称.隐式转换名称 /import object名称._ 导入
    //导入object中所有隐式转换

    //导入object中某个隐式转换
    //import com.atguigu.chapter01.$01_Implicits.double2Int

    //2、如果隐式转换放在class中,后续需要通过 import 对象名.隐式转换名称 /import 对象名._ 导入
    //val obj = new $02_Implicits
    //导入class中所有隐式转换
    //import obj._
    //导入class中某个隐式转换
    //import obj.double2Int2

    // 1、当前类型与目标类型不一致
    val d1:Int = 10.2
    val d2:Int = 10.2
    val d3:Int = 10.2
    val d4:Int = 10.2
    val d5:Int = 10.2
    val d6:Int = 10.2
    val d7:Int = 10.2
    val d8:Int = 10.2
    val d9:Int = 10.2
    val s1:Int = 10.2
    println(d1)

    //2、当对象使用来不属于自己的方法/属性的时候
    val animal = new Animal
    println(animal.color)

  }




}
