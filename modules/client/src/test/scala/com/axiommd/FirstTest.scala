package com.axiommd

import org.scalatest._
import wordspec._
import matchers._

import typings.comAxiommdFirstsprotty.libMod.container


class FirstTest extends AnyWordSpec with should.Matchers{
  "this" should {
    "work" in {
        // val c = container() //this won't work because it needs  browser infrastructure
        // val g = graph
        true should be(true)
    }
  }
}
