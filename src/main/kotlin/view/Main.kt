package view

import tornadofx.*

class Main: View() {
    override val root = vbox {
        prefHeight = 500.0
        prefWidth = 500.0

        label {
            text = "Hello world!"
            
        }
    }
}