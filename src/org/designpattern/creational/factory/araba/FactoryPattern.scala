trait Car

private class Audi extends Car
private class Bmv extends Car

object Car {
  def apply(typ: String) = typ match {
    case "audi" => new Audi()
    case "bmv" => new Bmv()
    case _ => throw new Error("No match")
  }
}

val myCar1 = Car("audi")
val myCar2 = Car("bmv")
//val myCar3 = Car("other") //Error



