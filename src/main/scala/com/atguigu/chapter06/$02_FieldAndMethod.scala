package com.atguigu.chapter06


object $02_FieldAndMethod {

  class Person{

    private val name:String = "lisi"

    var age:Int = 20

    val sex = "man"
    //scala中var修饰的属性可以使用_赋予初始值,使用_赋予初始值的时候必须指定属性的类型。
    var address:Double = _


    private def m1(x:Int) = x*x

    def printHello() = println("Hello...")
  }

  /**
    * java class中创建属性: [访问修饰符] 类型 属性名[ = 初始值]
    *
    *
    * scala class中创建属性:[访问修饰符] val/var 属性名:类型 = 初始值
    * scala中var修饰的属性可以使用_赋予初始值,使用_赋予初始值的时候必须指定属性的类型。
    * scala中没有public关键字,默认就是public效果
    * scala class中创建方法:[访问修饰符] def 方法名(参数名:类型,..):返回值类型 = {...}
    */
  def main(args: Array[String]): Unit = {

    val person = new Person
    println(person.age)
    //person.name
    person.age = 20

    //person.sex = "woman"
    println(person.address)
    //本地变量不能用_赋予初始值
    //var xx:String = _

    person.printHello()
    //person.m1
  }
}
