package model

import javafx.collections.FXCollections
import javafx.collections.ObservableList

object BeltGrades {
    private var beltGrades: ObservableList<Models.BeltGrade> = FXCollections.observableArrayList()
    init {
        beltGrades.addAll(
                Models.BeltGrade("10. Kup", 10),
                Models.BeltGrade("9. Kup", 9),
                Models.BeltGrade("8. Kup", 8),
                Models.BeltGrade("7. Kup", 7),
                Models.BeltGrade("6. Kup", 6),
                Models.BeltGrade("5. Kup", 5),
                Models.BeltGrade("4. Kup", 4),
                Models.BeltGrade("3. Kup", 3),
                Models.BeltGrade("2. Kup", 2),
                Models.BeltGrade("1. Kup", 1),
        )
    }

    fun getBeltGrades(): ObservableList<Models.BeltGrade> {
        return beltGrades;
    }
}