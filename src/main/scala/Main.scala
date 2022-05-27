package de.dfki.cps

import sysml.SysMLParser.lexical

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    val text = "and"
    def parse(code: String) = {
      val tokens = new lexical.Scanner(code)
    }
  }
}




