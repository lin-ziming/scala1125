package com.atguigu.chapter05

object $08_NoNameFunction {

  /**
    * 匿名函数: 没有函数名的函数称之为匿名函数
    * 匿名函数一般是作为高阶函数的参数值传递使用,一般不会单独使用
    */
  def main(args: Array[String]): Unit = {

    val func = (x:Int,y:Int) => {
      x+y
    }
    //匿名函数
    println(((x: Int, y: Int) => x + y).apply (10, 20))

    sum(10,20,func)
    //匿名函数一般是作为高阶函数的参数值传递使用
    sum(10,20, (x:Int,y:Int) =>x+y )

  }


  def sum(x:Int,y:Int,func:(Int,Int)=>Int) = {
    func(x,y)
  }

}
