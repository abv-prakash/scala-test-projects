package com.example.ScalaTest

import org.scalatest.{Matchers, FlatSpec}

import scala.collection.mutable

/**
  * Created by abhinavp on 3/21/16.
  */
class ExampleSpecTest extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)

  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new mutable.Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }

}
