package com.atguigu.chapter07

import scala.collection.immutable.Queue

object $10_ImmutableQueue {

  def main(args: Array[String]): Unit = {
    //创建不可变队列
    val q1 = Queue[Int](1,4,3,2)
    println(q1)

    //添加元素
    val q2 = q1.+:(10)
    println(q2)

    val q3 = q1.:+(20)
    println(q3)

    val q4 = q1.++(List(11,22,33))
    println(q4)

    val q5 = q1.++:(List(44,55,66))
    println(q5)
    
    val q6 = q1.enqueue(77)
    println(q6)

    //删除
    val q7 = q1.dequeue
    println(q7)

    //通过角标获取值
    println(q6(0))

    //通过角标修改值
    val q8 = q6.updated(0,100)
    println(q8)
  }
}
