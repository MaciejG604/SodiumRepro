//> using dep org.virtuslab.scala-cli:libsodiumjni:0.0.3

import libsodiumjni.Sodium
import libsodiumjni.internal.LoadLibrary

object Main extends App {
    LoadLibrary.initializeFromResources()
    Sodium.init()
}