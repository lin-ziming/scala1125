package com.atguigu.chapter04

import scala.util.control.Breaks._
object $06_BreakAndContinue {

  /**
    * break: 跳出循环
    * continue: 中断本次循环,开始下一次循环
    * scala中没有break与continue关键字。
    *
    * scala实现break与continue:
    *     1、导入包: import scala.util.control.Breaks._
    *     2、breakable、break方法实现
    */
  def main(args: Array[String]): Unit = {

    var a = 0
    //break实现
    /*try{
      while(a<=10){

        if(a==5){
          throw new Exception("我跳出了...")
        }
        println(s"a=${a}")
        a=a+1
      }
    }catch {
      case e:Exception =>
    }*/

    //scala的break
    breakable({

      while(a<=10){

        if(a==5){
          break()
        }
        println(s"a=${a}")
        a=a+1
      }
    })

    //continue实现
    a=0
   /* while(a<=10){

      try{
        if(a==5){
          a=a+1
          throw new Exception("我跳出了...")
        }
        println(s"a=${a}")
        a=a+1
      }catch {
        case e:Exception =>
      }
    }*/

    while(a<=10){

      breakable({
        if(a==5){
          a=a+1
          break()
        }
        println(s"a=${a}")
        a=a+1

      })


    }
  }
}
