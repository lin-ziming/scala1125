package com.atguigu.chapter01

import com.atguigu.chapter10.$01_ImplicitMethod.{Dog, Animal}

object $01_Implicits {

  implicit def double2Int( d:Double ):Int = d.toInt

  implicit def person2Dog( p:Animal ):Dog = new Dog

  implicit val a:Int = 100

  implicit val b:Int = 200
}

class $02_Implicits{
  implicit def double2Int1( d:Double ):Int = (d+1).toInt
  implicit def double2Int2( d:Double ):Int = (d*10).toInt
}
