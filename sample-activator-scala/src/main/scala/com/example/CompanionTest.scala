package com.example

/**
  * Created by abhinavp on 3/7/16.
  */
class CompanionTest {

  private val x = 10
  private val y = 20

  def sum(i : Int , j : Int ) : Int  = {
    if (x > 0 & y > 0) (x + y) else (i + j)
  }

}

object CompanionTest {

  def apply() = new CompanionTest()
}
