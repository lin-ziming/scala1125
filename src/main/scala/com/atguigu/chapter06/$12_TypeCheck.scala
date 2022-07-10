package com.atguigu.chapter06

import scala.util.Random

object $12_TypeCheck/* extends App*/{

  val RED = "red"

  class Animal

  class Dog extends Animal{

    val name = "旺财"
  }

  class Pig extends Animal{
    val color = "red"
  }

  /**
    * java判断对象是否属于某个类型:  对象 instanceof 类型
    * java中将对象强制转换成某个类型: (类型)对象
    * java中获取对象的class形式: 对象.getClass
    * java中获取类的class形式: 类名.class
    *
    * scala中判断对象是否属于某个类型: 对象.isInstanceOf[类型]
    * scala中将对象强制转换成某个类型: 对象.asInstanceOf[类型]
    * scala中获取对象的class形式: 对象.getClass
    * scala中获取类的class形式: classOf[类名]
    */
  def main(args: Array[String]): Unit = {

    val animal = getAnimal()

    println(animal.getClass)
    println(classOf[Dog])
    if(animal.isInstanceOf[Dog]) {
      val dog = animal.asInstanceOf[Dog]
      println(dog.name)
    }else{
      val pig = animal.asInstanceOf[Pig]
      println(pig.color)
    }
  }



  def getAnimal() = {

    val index = Random.nextInt(10)
    println(s"index=${index}")
    if(index%2==0){
      new Pig
    }else{
      new Dog
    }

  }
}
