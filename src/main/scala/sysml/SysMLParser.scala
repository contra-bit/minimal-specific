package de.dfki.cps
package sysml

import ocl.{OclLexer, OclParsers}

object SysMLParser extends  OclParsers {

  override type Elem = OclLexer.Token

  val lexical = new OclLexer

}