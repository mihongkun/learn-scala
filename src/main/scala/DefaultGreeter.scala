/**
  * Created by m on 17-6-12.
  */
trait Greeter {
  def greet(name: String): Unit = println("hello, " + name)
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, suffix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name +  suffix)
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    val greeter = new DefaultGreeter()
    greeter.greet("Scala Developer")

    val customizableGreeter = new CustomizableGreeter("How are you, ","?")
    customizableGreeter.greet("Scala Developer")
  }
}
