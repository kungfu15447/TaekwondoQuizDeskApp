package view

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.*

class Main: View() {
    var lab = label()
    var gradeComboBox = combobox<String>()
    var amountOfQComboBox = combobox<Number>()
    var startQuizButton = button()
    var beltGrades: ObservableList<String> = FXCollections.observableArrayList<String>(
            "10. Kup",
            "9. Kup",
            "8. Kup",
            "7. Kup"
    )
    var questionAmount: ObservableList<Number> = FXCollections.observableArrayList<Number>(
            10,
            20,
            30
    )
    var selectedGrade = SimpleStringProperty()
    var selectedAmount = SimpleIntegerProperty()
    override val root = vbox {
        prefHeight = 500.0
        prefWidth = 500.0

        lab = label {
            text = "Hello World"
        }

        gradeComboBox = combobox {
            bindSelected(selectedGrade)
            value = beltGrades[0]
            items = beltGrades
        }

        amountOfQComboBox = combobox {
            label {
                text = "Spørgsmål: "
            }
            bindSelected(selectedAmount)
            value = questionAmount[0]
            items = questionAmount
        }

        startQuizButton = button {
            text = "Start quiz!"
            action {
                println("Du har nu startet quizzen. ER DU FORBEREDT??")
            }
        }
    }

    init {
        selectedGrade.onChange {
            println("Selected grade: " + selectedGrade.value)
        }
        selectedAmount.onChange {
            println("Selected amount " + selectedAmount.value)
        }

    }

    override fun onDock() {
        lab.translateX = ((root.width / 2) - (lab.width / 2))
    }
}