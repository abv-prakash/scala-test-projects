package com.example.actors

/**
  * Created by abhinavp on 3/9/16.
  */
import akka.actor.{Props, ActorSystem}
import MyActor._
object TestActor extends scala.App {

  val system = ActorSystem("mySystem")
  val myActor2 = system.actorOf(Props[MyActor], "myActor2")
  val myActor3 = system.actorOf(Props[MyActor], "myActor3")
  val myActor4 = system.actorOf(Props[MyActor], "myActor4")

  myActor2 ! Greeting("Abhinav")
  myActor3 ! Greeting("Prakash")
  myActor4 ! Greeting("Adroit")
  myActor2 ! GoodBye
  myActor4 ! GoodBye
  myActor3 ! GoodBye

  myActor2 ! """Hello"""
  myActor2 ! 2

}
