package com.atguigu.chapter06

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializeFilter

import scala.beans.BeanProperty

object $04_Private {

  class Person(){
    @BeanProperty
    /*private*/ var name:String = _

    @BeanProperty
    /*private*/ var age:Int = _

    /*def getName() = this.name

    def setName(name:String) = this.name = name

    def setAge(age:Int) = this.age = age

    def getAge() = this.age*/
  }

  /**
    * java很多api底层都需要java set/get方法,scala为了兼容java提供了注解@BeanProperty注解,该注解能够自动生成set/get方法
    * @BeanProperty注解不能用在private修饰的属性上
    */
  def main(args: Array[String]): Unit = {

    val person = new Person()
    person.name = "lisi"
    person.age = 20

    //将对象转json
    println(JSON.toJSONString(person, null.asInstanceOf[Array[SerializeFilter]]))
    //Error:(33, 18) ambiguous reference to overloaded definition,
    //both method toJSONString in class JSON of type (x$1: Any, x$2: com.alibaba.fastjson.serializer.SerializerFeature*)String
    //and  method toJSONString in class JSON of type (x$1: Any)String
    //match argument types (com.atguigu.chapter06.$04_Private.Person) and expected result type Any
    //    println(JSON.toJSONString(person))

    //json转对象
    val json = """{ "name": "wangwu", "age":100 }"""
    val person2 = JSON.parseObject(json,classOf[Person])
    println(person2.getName)
    println(person2.getAge)
  }
}
