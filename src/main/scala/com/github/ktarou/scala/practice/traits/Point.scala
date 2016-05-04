package com.github.ktarou.scala.practice.traits

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
class Point(xc: Int, yc: Int) extends Similarity{
  var x: Int = xc
  var y: Int = yc

  // override flag is optional since we are overriding method without concrete implementation (abstract method)
  def isSimilar(point: Any): Boolean = {
    point.isInstanceOf[Point] && point.asInstanceOf[Point].x == x
  }
}
