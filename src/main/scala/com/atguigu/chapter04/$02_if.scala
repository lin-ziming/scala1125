package com.atguigu.chapter04

object $02_if {

  /**
    * java if分支判断用法
    *     单分支: if(...){...}
    *     双分支: if(...){...} else {....}
    *     多分支: if(...){...} else if(...){...} ... else{...}
    *scala if分支判断用法与java基本一样
    *scala if分支判断用法
    *    单分支: if(...){...}
    *    双分支: if(...){...} else {....}
    *    多分支: if(...){...} else if(...){...} ... else{...}
    *scala if分支判断是返回值的,返回值是符合条件的分支的块表达式的结果值
    */
  def main(args: Array[String]): Unit = {

    val a = 10

    //单分支
    if(a%3==0){

      println("a是3的倍数")
    }

    //双分支
    if(a%5==0){
      println("a是5的倍数")
    }else{
      println("a不是5的倍数")
    }

    //多分支
    val x = if(a%4==0){
      println("a是4的倍数")
      10
    }else if(a%6==0){
      println("a是6的倍数")
      20
    }else{
      println("a是其他")
      30
    }

    println(x)
  }
}
