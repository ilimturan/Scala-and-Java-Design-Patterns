/**
 * Created by ilimturan on 17/11/14.
 */

abstract class ElectricalPower(q1: Double, q2: Double, d: Double) extends Cloneable {

  protected def pClone[T] = {
    val cloneObj = this.clone
    cloneObj.asInstanceOf[T]
  }

  def mClone[T] = {
    pClone[T]
  }

  override def toString = {
    "ElectricalForcePrototype{" + "q1=" + q1 + ", q2=" + q2 + ", d=" + d + "}"
  }

}

class Earth(q1: Double, q2: Double, d: Double) extends ElectricalPower(q1, q2, d) {

  //override def mClone[T] = pClone[T]
  var k: Double = 1.0
  def power = {
    k * ((q1 * q2) / (d * d))
  }

}

class Mars(q1: Double, q2: Double, d: Double) extends ElectricalPower(q1, q2, d) {

  //override def mClone[T] = pClone[T]
  var k: Double = 0.7
  def power = {
    k * ((q1 * q2) / (d * d))
  }

}

class Wormhole(q1: Double, q2: Double, d: Double) extends ElectricalPower(q1, q2, d) {

  //override def mClone[T] = pClone[T]
  var k: Double = 0.0
  def power = {
    k * ((q1 * q2) / (d * d))
  }

}

object Test extends App {
  val earthElectricalForce = new Earth(1.0, 2.2, 3.99);
  println(earthElectricalForce.power);
  println(earthElectricalForce.toString);

  //does not working
  //val marsElectricalForce = earthElectricalForce.mClone[Mars]

}

