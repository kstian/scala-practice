package com.github.ktarou.scala.practice.mixin

/**
  * 5/3/2016
  *
  * @author kustian@mitrais.com
  * @since
  */
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
