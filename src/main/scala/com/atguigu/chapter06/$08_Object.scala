package com.atguigu.chapter06

object $08_Object {

  val name = "lsii"
  /**
    *  scala object定义的就是单例，获取单例对象直接通过 object名称 获取.
    *  object中定义所有的属性/方法都是类似java static修饰的,可以通过 object名称.方法名/属性名 方式调用
    *  class中定义所有的属性/方法都是类似java 非static修饰的,可以通过 对象.方法名/属性名 方式调用
    *
    *  伴生类[class]与伴生对象[object]
    *     1、前提: <模拟java一个类既有静态又有非静态的效果>
    *       1、class与object必须同名
    *       2、class与object必须在同一个.scala源文件中
    *     2、伴生类和伴生对象可以互相访问对方的私有成员
    *  apply方法: 主要用于简化伴生类的对象的创建
    *  apply方法必须定义在伴生对象中
    *  伴生对象中定义apply方法之后,后续创建伴生类的对象就可以使用 object名称.apply(..) / object名称(..) 创建
    */
  def main(args: Array[String]): Unit = {

    println($08_Object)
    println($08_Object)
    println($08_Object)
    println($08_Object)

    println($08_Object.name)

    println(Person.name)
    println(new Person().age)
    //Person.address

    //通过apply方法创建伴生类的对象
    val person = Person.apply()
    val person2 = Person()
  }
}

class Person{

  val age = 20

  private val sex = "man"
  //可以访问伴生对象的私有成员
  def getAddress() = Person.address
}

object Person{
  val name = "LISI"

  private val address = "shenzhen"
  //访问伴生类的私有成员
  def getSex() = new Person().sex

  def apply():Person = new Person
}