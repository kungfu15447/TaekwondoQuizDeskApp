package view

import tornadofx.*

class Main: View() {
    var lab = label()
    override val root = vbox {
        prefHeight = 500.0
        prefWidth = 500.0

        lab = label {
            text = "Hello World"
        }



    }

    override fun onDock() {
        lab.translateX = ((root.width / 2) - (lab.width / 2))
        println(lab.width)
    }
}