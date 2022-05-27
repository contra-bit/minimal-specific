package de.dfki.cps
package ocl

import de.dfki.cps.ocl.OclLexer.keyword

import scala.util.parsing.combinator.PackratParsers

trait  OclParsers extends PackratParsers {

  override type Elem = OclLexer.Token

  implicit  def elem[T <: Elem](elem: T): Parser[Elem] = accept(elem)



}