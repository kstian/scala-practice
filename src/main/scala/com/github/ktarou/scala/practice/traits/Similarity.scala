package com.github.ktarou.scala.practice.traits

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}
