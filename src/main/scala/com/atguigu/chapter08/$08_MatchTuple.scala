package com.atguigu.chapter08

object $08_MatchTuple {

  /**
    * 匹配元组的时候,变量是几元元组，case中匹配条件就必须是几元元组
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val t = ("lisi",20,"shenzhen")

    t match {
      case (x,y,z) => println(x,y,z)
      //case (x,y) => println(x,y)
    }

    val list4 = List(
      ("宝安区",("宝安中学",("法师班",("安其拉",18)))),
      ("宝安区",("宝安中学",("法师班",("王昭君",18)))),
      ("宝安区",("宝安中学",("法师班",("小乔",18)))),
      ("宝安区",("宝安中学",("法师班",("甄姬",18))))
    )

    //for(element<- list4){
    //  println(element._2._2._2._1)
    //}

   //获取学生姓名
    val list5 = list4.map(x=> {
      //x = ("宝安区",("宝安中学",("法师班",("安其拉",18))))
      x match {
        case (regionName,(schoolName,(className,(stuName,age)))) => stuName
      }
    })

    println(list5)
  }
}
