object Main {

  def inputData =
    for{
      line <- io.StdIn.readLine()
    } yield line

  def greeting(name: String): String = {
    val msg = "WELCOME %s, HELLO WORLD"
    msg.format(name)
  }


  def main(args: Array[String]): Unit = {

    println("Welcome Scala App")
    println("could you write your name ?")

    val line = inputData

    println(greeting(line))
  }
}

