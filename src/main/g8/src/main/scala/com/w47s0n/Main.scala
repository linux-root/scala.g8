package com.w47s0n

$if(useScala2.truthy)$object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(msg)
  }

  def msg: String = "I was compiled by Scala 2.13.17"
}$else$@main def hello(): Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3.3.6"$endif$
