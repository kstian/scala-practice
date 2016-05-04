package com.github.ktarou.scala.practice.functions

/**
  * 5/4/2016
  *
  * @author kustian@mitrais.com
  * @since
  */

object TestFunctions extends App{
  val x = 10
  val y = 10
  def calculateArea(f:(Int, Int) => Int): Int ={
    f(x,y)
  }

  println (calculateArea((a: Int, b:Int) => {
    a * b
  }))
  println (calculateArea((a: Int, b:Int) => {
    a - b
  }))
  println (calculateArea((a: Int, b:Int) => {
    a + b
  }))
}
