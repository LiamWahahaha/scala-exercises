class WorldlyGreeter(greeting: String) {
  def greet() {
    // Invoking a method on a singleton object from class WorldlyGreeter
    val worldlyGreeting = WorldlyGreeter.worldify(greeting)
    println(worldlyGreeting)
  }
}

object WorldlyGreeter {
  def worldify(s:String) = s + ", world!"
}
