/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.designpattern.factory.document

trait Document

class Word extends Document
class Pdf extends Document

object Document {
  def apply(typ: String) = typ match {
    case "word" => new Word()
    case "pdf" => new Pdf()
    case _ => throw new Error("No match")
  }
}

val myDoc1 = Document("word")
val myDoc2 = Document("pdf")
//val myDoc3 = Document("other") //Error



