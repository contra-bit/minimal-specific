package de.dfki.cps
package ocl

import scala.util.parsing.combinator.token.Tokens

object OclTokens extends OclTokens

trait OclTokens extends Tokens {

  sealed abstract class OclToken extends Token

  val oclKeywords = Set[Keyword](AND)

  val delimiters: Set[Delimiter] = Set[Delimiter](
    AT
  )

  sealed abstract class Keyword(val chars: String) extends OclToken

  abstract class Delimiter(val chars: String) extends OclTokens

  case object AND extends Keyword("and")

  case object AT extends Delimiter("@")
}
