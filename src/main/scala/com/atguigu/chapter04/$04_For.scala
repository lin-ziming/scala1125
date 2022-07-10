package com.atguigu.chapter04

object $04_For {

  /**
    * for循环基本语法: for( 变量名 <- 集合/数组/表达式) { 循环体 }
    * for循环守卫: for( 变量名 <- 集合/数组/表达式 if(布尔表达式) ) { 循环体 }
    * for循环步长: for( 变量名 <- start to/until end by step  ) { 循环体 } [步长是指to/until方法生成的集合中每个元素的间距]
    * 嵌套循环: for(变量名 <- 集合/数组/表达式 ; 变量名 <- 集合/数组/表达式; ...) {循环体}
    * 引入变量: for(变量名 <- 集合/数组/表达式 ; 变量名3 = 值 ;变量名 <- 集合/数组/表达式; ...) {循环体}
    * yield表达式:  for( 变量名 <- 集合/数组/表达式) yield { 循环体 }
    *     yield表达式每次循环都会执行循环体,将每次循环体块表达式的结果值收集,等到循环完成之后返回最终结果集合
    *
    *
    */
  def main(args: Array[String]): Unit = {

    for(i <- 1 to 10){
      println(s"i=${i}")
    }

    //for嵌套if判断
    for(j<- 1 to 10 ){

      //println(s"jjjj=${j}")
      if(j%2==0){

        println(s"j=${j}")
      }
    }

    //守卫
    for(k<- 1 to 10 if(k%2==0)){
      println(s"k=${k}")
    }

    //for循环步长: for( 变量名 <- start to/until end by step  ) { 循环体 }
    for(a<- 1 to 10 by 3){
      println(s"a=${a}")
    }

    //嵌套循环
    for(b<- 0 to 10){
      //println(s"b=${b}")
      val p = b * b
      for(c<- 0 to p){

        println(s"b+c=${b+c}")
      }
    }

    //嵌套循环: for(变量名 <- 集合/数组/表达式 ; 变量名 <- 集合/数组/表达式; ...) {循环体}
    for(d<- 0 to 10;  k<- d to 10){
      println(s"d+k=${d+k}")
    }

    //引入变量
    val x = for(t<- 0 to 10; p = t * t; r<- 0 to p){
      println(s"r+t=${r+t}")
    }


    val y = for( u<- 1 to 10 ) yield{

      u * 10
    }

    println(y)

    1 to 10 foreach(println(_))
  }
}
