//> using dep org.virtuslab.scala-cli:libsodiumjni:0.0.3
// //> using dep com.lihaoyi::os-lib:0.9.2

import libsodiumjni.Sodium
import libsodiumjni.internal.LoadLibrary

object Main extends App {
    LoadLibrary.initializeFromResources()
    
    Sodium.init()
    println("Hello Sodium§")
}
