package com.atguigu.chapter05

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object $03_MethodParam {

  /**
    * 方法参数
    *     1、默认值参数: 在定义方法的时候参数可以指定默认值,后续在调用方法的时候有默认值的参数就可以不用传值
    *         如果方法有多个参数,只有个别参数有默认值,建议在定义方法的时候有默认值的参数定义在参数列表的后面
    *         语法: def 方法名(参数名:类型=默认值,...):返回值类型 = {方法体}
    *     2、带名参数: 在调用方法的时候指定将值传给哪个参数
    *         语法: 方法名(参数名=值,...)
    *     3、可变参数: 在定义方法的时候指定,后续在调用方法的时候可变参数传值的话个数可以不固定
    *         语法: def 方法名(参数名:类型,...,参数名:类型*):返回值类型 = {方法体}
    *         注意:
    *             1、可变参数不能与默认值参数一起使用
    *             2、可变参数必须放在参数列表最后面
    *             3、scala可变参数不能直接传递集合,如果想要将集合元素传给可变参数,必须采用: 集合名:_*
    *
    */
  def main(args: Array[String]): Unit = {

    println(sum(10, 20))

    println(sum2())
    println(sum2(20))

    println(sum3(20))

    //带名参数
    println(sum4(y=30))

    println(add(20,30,40))

    val paths = getPaths("/user/hive/warehouse/user_log", 7)
    //3、scala可变参数不能直接传递集合,如果想要将集合元素传给可变参数,必须采用: 集合名:_*
    readPaths(paths:_*)
  }

  def sum(x:Int,y:Int):Int = x+y

  //默认值参数
  def sum2(x:Int=10,y:Int=50):Int = x+y
  //如果方法有多个参数,只有个别参数有默认值,建议在定义方法的时候有默认值的参数定义在参数列表的后面
  def sum3(y:Int,x:Int=10):Int = x+y

  def sum4(x:Int=10,y:Int) = x+y

  //可变参数
  def add(x:Int,y:Int*) = x + y.sum


  // /user/hive/warehouse/user_log/2022-03-03
  // /user/hive/warehouse/user_log/2022-03-02
  // /user/hive/warehouse/user_log/2022-03-01
  // /user/hive/warehouse/user_log/2022-02-28
  // /user/hive/warehouse/user_log/2022-02-27
  // /user/hive/warehouse/user_log/2022-02-26
  // /user/hive/warehouse/user_log/2022-02-25
  // /user/hive/warehouse/user_log/2022-02-24
  /**
    * 获取指定路径前缀前N天所有目录
    * @param pathPrefix 路径前缀
    * @param n n天
    */
  //需求: 统计前7天用户总的注册数
  def getPaths(pathPrefix:String ,n:Int) = {

    //获取当前时间
    val time = LocalDateTime.now()

    for(i<- 1 to n) yield {
      //获取前i天的时间
      val beforeNDayTime = time.plusDays(-i)
      //对时间格式化
      val timestr = beforeNDayTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

      s"${pathPrefix}/${timestr}"
    }
  }

  def readPaths(paths:String*): Unit ={
    //模拟读取目录所有数据
    for(path<- paths) {
      println(path)
    }
  }
}
