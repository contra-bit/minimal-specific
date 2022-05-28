package de.dfki.cps.ocl

import de.dfki.cps.ocl.OclTokens.oclKeywords

import scala.util.parsing.combinator.RegexParsers
import scala.util.parsing.combinator.lexical.Lexical
import scala.util.parsing.input.Reader

object OclLexer extends OclLexer

class OclLexer extends Lexical with OclTokens {
    override def whitespace: Parser[Any] = (whitespaceChar).*
    override def token: Parser[Token] = (keyword | token)


    def keyword = named("keyword", oclKeywords.map {
      case k => acceptSeq(k.chars) ~ not(nameChar) ^^^ k
    }.reduceRight[Parser[Token]] { case (x, y) => x ||| y })


    def named[T](name: String, p: Parser[T]): Parser[T] =
      p | Parser(i => Failure(s"expected $name but found ${i.first.toString}", i))

    def nameStartChar =
      letter | '_' | '$'

    def nameChar = nameStartChar | digit






  // A scanner is a reader for tokens
  class Scanner(src: String) extends Reader[Token] {

    import scala.util.parsing.input.{Position, NoPosition}

    var p = 0

    override def rest: Reader[Token] = {
      p = p + 1
      this
    }

    def pos: Position = NoPosition
    override def atEnd: Boolean = true
    override def first = ???
  }
  }
