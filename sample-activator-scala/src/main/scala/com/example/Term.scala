package com.example

/**
  * Created by abhinavp on 3/9/16.
  */
abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term
