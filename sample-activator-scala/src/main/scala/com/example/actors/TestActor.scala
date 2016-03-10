package com.example.actors

/**
  * Created by abhinavp on 3/9/16.
  */
import akka.actor.{Props, ActorSystem}
import MyActor._
object TestActor extends scala.App {

  val system = ActorSystem("mySystem")
  val myActor = system.actorOf(Props[MyActor], "myActor2")

  myActor ! Greeting("Abhinav")
  myActor ! GoodBye
  myActor ! """Hello"""
  myActor ! 2

}
