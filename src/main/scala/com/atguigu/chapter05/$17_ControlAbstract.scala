package com.atguigu.chapter05

object $17_ControlAbstract {

  /**
    * 控制抽象:
    *     语法: =>返回值类型
    *     控制抽象不能单独定义,只能作为方法的参数类型存在,后续可以当做函数来调用,调用的时候不能带上()
    *     控制抽象其实就是一个可以反复执行的块表达式
    */
  def main(args: Array[String]): Unit = {

    val b = {
      println("------------------")
      10
    }

    m1(b)
    m1(b)
    m1(b)

    val func = () => {
      println("++++++++++++++")
    }
    m2(func)
    m2(func)
    m2(func)

    m3({
      println("*************")
      10
    })


    m3(10)
    m3(10)
    m3(10)

    var a = 0
    /*while(a<=10){
      println(s"a=${a}")
      a=a+1
    }*/

    myWhile(a<=10){
      println(s"a=${a}")
      a=a+1
    }
  }

  def myWhile(condition: =>Boolean)(loop: =>Unit):Unit = {

    if(condition){
      loop
      myWhile(condition)(loop)
    }
  }

  def m1(x:Int) = {
    x * x
  }


  def m2(func: ()=>Unit) = {
    func()
  }

  def m3(func: =>Unit) = {
    //调用控制抽象
    func
    func
    func
  }


}
