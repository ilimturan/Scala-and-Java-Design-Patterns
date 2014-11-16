/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.designpattern.creational.abstractfactory.scala

abstract class Db{
  def typee: String
}
abstract class NosqlDb extends Db
abstract class SqlDb extends Db

class Cassandra extends NosqlDb{
  def typee: String = "Nosql - Cassandara"
}

class MongoDb extends NosqlDb{
  def typee:String = "Nosql - Mongodb"
}

class Mysql extends SqlDb{
  def typee: String = "Sql - Mysql"
}

class Postgresql extends SqlDb{
  def typee: String = "Sql - Postgresql"
}
/**
 * abstract factory
 */
abstract class AbstractFactory{
  def createNosqlDb: Db
  def createSqlDb: Db
}

/**
 * factory 1
 */
object Factory1 extends AbstractFactory {
  def createNosqlDb: Db = new Cassandra
  def createSqlDb: Db = new Mysql
}

/**
 * factory 2
 */
object Factory2 extends AbstractFactory {
  def createNosqlDb: Db = new MongoDb
  def createSqlDb: Db = new Postgresql
}

/**
 * factory 1 and factory 2 test
 */
object Test extends App{

  val nosqlDb1 = Factory1.createNosqlDb
  val sqlDb1 = Factory1.createSqlDb

  val nosqlDb2 = Factory2.createNosqlDb
  val sqlDb2 = Factory2.createSqlDb

}


