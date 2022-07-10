package com.atguigu.chapter06

object $09_TraitDefined {

  trait Logger{

    //抽象方法
    def m1(x:Int,y:Int):Int

    //具体方法
    def m2(x:Int) = x*x

    //抽象属性
    val name:String

    //具体属性
    val age = 20

  }

  trait  Logger2{

    val sex = "man"
  }

  class Parent

  //如果子类需要继承父class,此时extends关键字用于继承父Class,特质的实现使用with关键字【每个特质都要使用一个with】
  class ErrorLogger extends Parent with Logger  with Logger2{
    override def m1(x: Int, y: Int): Int = x+y

    override val name: String = "lisi"
  }

  //2、如果子类不需要继承父Class,此时extends关键字用于实现第一个特质,其他的特质的实现使用with关键字
  class WarnLogger extends Logger with Logger2{
    override def m1(x: Int, y: Int): Int = x-y

    override val name: String = "wangwu"
  }

  class DebugLogger

  /**
    * 特质的定义语法: trait 特质名{....}
    * 特质中既可以定义抽象方法也可以定义具体方法,既可以定义抽象属性也可以定义具体属性
    * scala中子类实现特质
    *     1、如果子类需要继承父class,此时extends关键字用于继承父Class,特质的实现使用with关键字【每个特质都要使用一个with】
    *     2、如果子类不需要继承父Class,此时extends关键字用于实现第一个特质,其他的特质的实现使用with关键字
    *
    *对象混入: 让类的某个对象用于指定特质的属性和方法
    *     语法: new 类名(..) with 特质名
    */
  def main(args: Array[String]): Unit = {

    val logger = new ErrorLogger
    println(logger.name)

    val logger2 = new WarnLogger
    println(logger2.age)

    val logger3 = new DebugLogger with Logger2
    println(logger3.sex)
  }
}
