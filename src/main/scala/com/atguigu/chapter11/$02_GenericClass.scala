package com.atguigu.chapter11

object $02_GenericClass {

  class Person[T,U](val name:T,var age:U){

    def getName():T = this.name

    def getAge = this.age

    def setAge(age:U) = this.age = age
  }
  /**
    * 泛型类语法: class 类名[T,U,..](属性名:T,...){
    *       val 属性名:U = ...
    *
    *       def 方法名(参数名:T):U = ...
    *
    *   }
    *
    */
  def main(args: Array[String]): Unit = {

    val person = new Person[String,Int]("lisi",20)

    println(person.getName())
  }
}
