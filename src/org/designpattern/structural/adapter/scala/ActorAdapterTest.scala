/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.designpattern.structural.adepter.scala

trait ActorInterface {
  def move(speed: Int)
  def getPosition()
}

trait Bird {
  //positions
  var x: Int = 0
  var y: Int = 0
  var z: Int = 0

  def fly(speed: Int) {
    x += speed
    y += speed * 1
    z += speed * 2
  }

  def getPosition_ = {
    "Position{" + "x=" + x + ", y=" + y + ", z=" + z + "}"
  }
}

class BirdAdapter extends ActorInterface with Bird {

  @Override
  def move(speed: Int) {
    fly(speed)
  }
  @Override
  def getPosition() {
    getPosition_
  }
}

trait Car {
  //positions
  var x: Int = 0
  var y: Int = 0

  def run(speed: Int) {
    x += speed
    //y += speed
  }

  def getPosition_ = {
    "Position{" + "x=" + x + ", y=" + y + "}"
  }
}

class CarAdapter extends ActorInterface with Car {

  @Override
  def move(speed: Int) {
    run(speed)
  }
  @Override
  def getPosition() {
    getPosition_
  }
}

trait Gear {
  //positions
  var x: Int = 0
  var y: Int = 0

  def rotate(speed: Int) {
    //rotate
  }

  def getPosition_ = {
    "Position{" + "x=" + x + ", y=" + y + "}"
  }
}

class GearAdapter extends ActorInterface with Gear {

  @Override
  def move(speed: Int) {
    rotate(speed)
  }
  @Override
  def getPosition() {
    getPosition_
  }
}

object ActorAdapterTest extends App {
  var bird = new BirdAdapter()
  bird.move(11);
  println(bird.getPosition())

  var car = new CarAdapter()
  car.move(6);
  println(car.getPosition())

  var gear = new GearAdapter()
  gear.move(23);
  println(gear.getPosition())
}

