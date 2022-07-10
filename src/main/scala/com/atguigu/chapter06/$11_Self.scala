package com.atguigu.chapter06

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import scala.beans.BeanProperty

object $11_Self {


  trait ReadAndWrite{

    //_:Serializable =>
    this:Serializable =>
    /**
      * 从磁盘读取对象
      */
    def readObjectFromDisk()={

      val ois = new ObjectInputStream( new FileInputStream("d:/obj.txt") )

      val obj = ois.readObject()

      ois.close()

      obj
    }

    /**
      * 将当前对象写入磁盘
      */
    def writeObjectToDisk() = {

      val oos = new ObjectOutputStream( new FileOutputStream("d:/obj.txt") )

      oos.writeObject(this)

      oos.flush()

      oos.close()
    }
  }

  class Person extends ReadAndWrite with Serializable {
    @BeanProperty
    var name:String = _
    @BeanProperty
    var age:Int = _

  }

  /**
    * 自身类型: 提醒子类在继承特质的时候需要提前继承/实现指定的父类/父特质
    *
    */
  def main(args: Array[String]): Unit = {

    val person = new Person
    person.setName("lisi")
    person.setAge(20)

    person.writeObjectToDisk()

    val p2 = new Person
    val obj = p2.readObjectFromDisk().asInstanceOf[Person]
    println(obj.getAge)
    println(obj.getName)


  }
}
