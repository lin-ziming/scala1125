package com.atguigu.chapter11

import scala.beans.BeanProperty

object $05_GenericContext {

  class Person[T](@BeanProperty var name:T=null)

  /**
    * 上下文
    *     语法: U:类型
    *     泛型上下文后续会自动生成一个隐式参数,隐式参数类型为 类型[U]
    * @param args
    */
  def main(args: Array[String]): Unit = {

    implicit val p = new Person[String]()
    val person = m1[String]("lisi")

    println(person.name)

    println(m2("wangwu").name)
  }

  def m1[U](t:U)(implicit p:Person[U]) = {

    p.setName(t)

    p
  }
  //与上面等价
  def m2[U:Person](t:U) = {

    //召唤
    val person = implicitly[Person[U]]

    person.setName(t)

    person
  }
}
