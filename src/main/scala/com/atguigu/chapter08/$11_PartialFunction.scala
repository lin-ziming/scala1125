package com.atguigu.chapter08

import scala.io.StdIn

object $11_PartialFunction {

  /**
    * 偏函数: 没有match关键字的模式匹配称之为偏函数
    *     语法:
    *       val 函数名:PartialFunction[IN,OUT] = {
    *         case 条件 => ..
    *         case 条件 => ..
    *         .....
    *       }
    *       或者
    *       val 函数名: IN =>OUT = {
    *         case 条件 => ..
    *         case 条件 => ..
    *         .....
    *       }
    *
    *           IN: 代表函数的参数类型[相当于模式匹配中待匹配的对象类型]
    *           OUT: 代表函数的返回值类型[相当于模式匹配的返回值]
    *
    */
  def main(args: Array[String]): Unit = {

    val line = StdIn.readLine("请输入一个单词:")

    //val func:String=>Int  = {
    val func:PartialFunction[String,Int]  = {
      case "hadoop" =>
        println("hadoop.....")
        10
      case "spark" =>
        println("spark.....")
        20
      case "flume" =>
        println("flume.....")
        30
      case _ =>
        println("其他...")
        -1
    }

    println(func(line))


    val list4 = List(
      ("宝安区",("宝安中学",("法师班",("安其拉",18)))),
      ("宝安区",("宝安中学",("法师班",("王昭君",18)))),
      ("宝安区",("宝安中学",("法师班",("小乔",18)))),
      ("宝安区",("宝安中学",("法师班",("甄姬",18))))
    )
    val list5 = list4.map(x=> {
      //x = ("宝安区",("宝安中学",("法师班",("安其拉",18))))
      x match {
        case (regionName,(schoolName,(className,(stuName,age)))) => stuName
      }
    })

    //工作中使用偏函数的正确姿势
    //定义偏函数
    val func2: ( (String,(String,(String,(String,Int)))) )  => String = {
      case (regionName,(schoolName,(className,(stuName,age)))) => stuName
    }
    //使用偏函数
    val list6 = list4.map(func2)
    //直接传递函数值
    val list61 = list4.map({
      case (regionName,(schoolName,(className,(stuName,age)))) => stuName
    })
    //偏函数工作中一般结合元组的匹配使用
    //方法只有一个参数,()可以省略
    val list7 = list4.map{
      case (regionName,(schoolName,(className,(stuName,age)))) => stuName
    }
    println(list6)
    println(list7)

  }
}
