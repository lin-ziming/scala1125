package com.atguigu.chapter05

object $07_HightFunctionSample {

  /**
    * 高阶函数的简化: 调用高阶函数的时候简化
    *     1、可以直接传递函数的值
    *     2、可以省略函数的参数类型
    *     3、如果函数的参数在=>右边只使用了一次,那么可以用_代替
    *         注意:以下三种情况不能用_代替
    *             1、针对函数有多个参数的情况: 如果函数参数定义顺序与使用顺序不一致,此时不能用_代替 [因为第N个下划线代表函数第N个参数]
    *             2、针对函数体有嵌套的情况: 如果函数体中有嵌套,并且函数的参数在嵌套中以表达式形式存在,此时不能用_简化
    *             3、针对函数只有一个参数的情况: 如果函数只有一个参数，并且函数体中没有任何操作直接返回函数参数,此时不能用_简化
    *     4、如果函数只有一个参数,参数列表的()可以省略
    *
    */
  def main(args: Array[String]): Unit = {

    val f = (x:Int,y:Int) => x*y
    val f2 = (x:Int,y:Double) => x+y

    println(sum(10, 20,f))

    //1、可以直接传递函数的值:
    println(sum(10,20, (x:Int,y:Int) => x+y ))
    //2、可以省略函数的参数类型
    println(sum(10,20, (x,y) => x+y ))
    //3、如果函数的参数在=>右边只使用了一次,那么可以用_代替
    println(sum(10,20, _ - _ ))

    val func = (x:Int,y:Int)=> y-x
    println(sum(100, 500, func))
    //1、可以直接传递函数的值:
    println(sum(100, 500, (x:Int,y:Int)=> y-x ))
    //2、可以省略函数的参数类型
    println(sum(100, 500, (x,y)=> y-x ))
    //3.1、如果函数参数定义顺序与使用顺序不一致,此时不能用_代替 [因为第N个下划线代表函数第N个参数]
    println(sum(100,500, _ - _ ))

    //3.2、如果函数体中有嵌套,并且函数的参数在嵌套中以表达式形式存在,此时不能用_简化
    println(sum(100, 500, (x,y)=> (x+1)*y  ))
   // println(sum(100, 500, (_+1 )*_  ))
    println(sum(100, 500,(x,y)=>(x)*y  ))
    //( ( y ) => ( (x) => x.$plus(1) ).$times(y) )
    //( ( y ) => ( (x) => x + 1 ) * y )
    println(sum(100, 500,(_)*_  ))
    //println(sum(100, 500, (_+1) * _  ))


    val func2 = (x:Int) => x
    println(m1(100, func2))
    ////1、可以直接传递函数的值:
    println(m1(100, (x:Int) => x))
    ////2、可以省略函数的参数类型
    println(m1(100, (x) => x ))
    //3.3、如果函数只有一个参数，并且函数体中没有任何操作直接返回函数参数,此时不能用_简化
    val fx = m1(100, _ ) // x => m1(100,x)


    //4、如果函数只有一个参数,参数列表的()可以省略
    println(m1(100, x => x ))
  }

  def sum( x:Int,y:Int,func: (Int,Int)=>Int  ) = {

    func(x,y)
  }

  def m1(x:Int, func: Int =>Int ) = {
    func(x)
  }
}
