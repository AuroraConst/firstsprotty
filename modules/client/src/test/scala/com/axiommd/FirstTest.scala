package com.axiommd

import org.scalatest._
import wordspec._
import matchers._


import typings.comAxiommdFirst.comAxiommdFirstRequire
import typings.comAxiommdFirst.libMod.container
import typings.comAxiommdFirst.libAurorasprottyModelSourceMod.graph
// import typings.comAxiommdFirst.libModelSourceMod.graph
// import typings.sprotty.mod.{LocalModelSource,TYPES}
// import typings.sprottyProtocol.libModelMod.SModelRoot
// import typings.inversify.mod.Container


class FirstTest extends AnyWordSpec with should.Matchers{
  "this" should {
    "work" in {
        val c = container()
        // val g = graph
        true should be(true)
    }
  }
}
