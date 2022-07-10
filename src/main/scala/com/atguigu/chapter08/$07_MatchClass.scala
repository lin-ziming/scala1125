package com.atguigu.chapter08

object $07_MatchClass {

  case class Person(val name:String = "lisi" ,var age:Int, address:String)
  /**
    * 样例类: 其实就是伴生类与伴生对象的封装
    *     语法: case class 类名([val/var] 属性名:类型[=默认值],....)
    *           样例类中属性不用val/var修饰的属性默认就是val修饰
    *     创建样例类对象: Person.apply(属性值,...) /  Person(属性值,...)
    *
    * 样例类可以直接用于模式匹配
    * 普通类不能直接用于模式匹配的,如果想让普通类也能直接用于模式匹配需要在伴生对象中定义unapply方法[unapply方法是将对象解构成属性, apply方法是将属性封装成对象]
    */
  def main(args: Array[String]): Unit = {

    val person = Person("wangwu",20,"shenzhen")
    val person2 = Person(age = 20,address = "shenzhen")
    println(person)
    println(person2)
    println(person.name)
    println(person.age)
    person.age = 100
    println(person.age)
    println(person.address)
    //person.address = "beijing"

    val student = Student(30,"beijing")

    //样例类可以直接用于模式匹配
    person match {

      case Person(x,y,z) => println(s"x=${x} y=${y} z=${z}")
    }

    student match {
      case Student(x,y,z) => println(s"x=${x} y=${y} z=${z}")

    }
  }

  class Student(val name:String="lisi",var age:Int, val address:String)

  object Student{

    def apply(name:String,age:Int,address:String) = new Student(name,age,address)
    def apply(age:Int,address:String) = new Student(age=age,address=address)
    //普通类不能直接用于模式匹配的,如果想让普通类也能直接用于模式匹配需要在伴生对象中定义unapply方法[unapply方法是将对象解构成属性, apply方法是将属性封装成对象]
    def unapply(stu: Student): Option[(Int,String,String)] = {
      if(stu==null) None
      else Some( (stu.age,stu.name,stu.address) )
    }
  }
}
