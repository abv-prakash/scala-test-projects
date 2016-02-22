package com.example

/**
  * Created by abhinavp on 2/17/16.
  * Scala higher order functions
  */
object HOFSample {

  def id(x : Int) :Int = x
  def sumOfInts(a: Int , b:Int ): Int = if (a > b) 0  else id(a) + sumOfInts(a+1,b)

  def square(a: Int) : Int = a * a
  def sumOfSquares(a : Int, b: Int) : Int = if (a>b) 0 else square(a) + sumOfSquares(a+1,b)

  def powerOfTwo(x :Int) : Int = if (x == 0) 0 else 2 + powerOfTwo(x-1)
  def sumOfPowers(a :Int, b: Int) : Int = if (a>b) 0 else powerOfTwo(a) + sumOfPowers(a+1,b)


// Using higher order functions
  def sum(f:Int => Int, a : Int, b:Int) :Int = {
    if (a>b) 0 else f(a) + sum(f ,a +1 , b)
  }

  def sumOfIntsUsingHOF(a:Int, b:Int) :Int = sum(id,a,b)
  def sumOfSquaresUsingHOF(a:Int , b: Int) : Int = sum(square,a,b)
  def sumOfPowersUsingHOF(a:Int , b: Int) : Int = sum(powerOfTwo,a,b)

  def main(args :Array[String]) : Unit = {

   println(HOFSample.sumOfInts(10,15))
    println(HOFSample.sumOfIntsUsingHOF(10,15))
    println(HOFSample.sumOfSquares(1,3))
    println(HOFSample.sumOfSquaresUsingHOF(1,3))
    println(HOFSample.sumOfPowers(1,4))
    println(HOFSample.sumOfPowersUsingHOF(1,4))

  }

}
