package com.example.generics

/**
  * Created by abhinavp on 2/18/16.
  */
abstract class Stack[A] {

  def push(x : A) : Stack[A] = new NonEmptyStack[A](x,this)
  def isEmpty : Boolean
  def top : A
  def pop : Stack[A]

}


class EmptyStack[A] extends Stack[A] {
  def isEmpty : Boolean = true
  def top : A = error("empty stack.top")
  def pop : Stack[A] = error("empty stack.pop")


}

class NonEmptyStack[A](elem:A , rest:Stack[A]) extends Stack[A] {
  def isEmpty : Boolean = false
  def top : A = elem
  def pop : Stack[A] = rest
}