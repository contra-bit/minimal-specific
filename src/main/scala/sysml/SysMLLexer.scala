package de.dfki.cps
package sysml

import ocl.OclLexer

object SysMLLexer extends OclLexer {

  override def token = super.token

  def lineBreak = ('\r' ~ '\n' | '\n' | '\r')
}
