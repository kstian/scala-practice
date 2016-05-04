package com.github.ktarou.scala.practice.classes

/**
  * 5/2/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
class Point(xc: Int, yc: Int){
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
  }
  // override flag is a must since we are overriding method with concrete implementation
  override def toString(): String = "(" + x + ", " + y + ")";
}
