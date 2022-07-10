package com.atguigu.chapter10

import com.atguigu.chapter10.$03_ImplicitClass.Person


object $03_ImplicitClass {

  class Person{

    val name  ="lisi"
  }

  implicit class Parent(p:Person){

    def getName() = this.p.name
  }

  /**
    * 隐式类: 将一个类型转换成隐式类的类型
    *     语法: implicit class 类名(属性: 待转换类型){...}
    * 后续scala会自动调用隐式类的主构造器将待转换类型转为隐式类类型
    * 隐式类不能置于最顶层,必须定义在object/class中
    *
    */
  def main(args: Array[String]): Unit = {

    val person = new Person()

    println(person.getName)
  }

  //implicit def person2Parent( p:Person  ):Parent = new Parent(p)

}
