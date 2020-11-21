package view

import tornadofx.App
import tornadofx.launch

class TQDApp: App(Main::class)

fun main (args: Array<String>) {
    launch<TQDApp>(args)
}