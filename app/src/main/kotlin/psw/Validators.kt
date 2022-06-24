package psw

object Validators {
    val hasUpperCase = { pass: String -> pass.contains("[A-Z]".toRegex()) }.toVal()

    val validLength = { pass: String -> pass.length > 8 }.toVal()

    val hasNumber = { pass: String -> pass.contains("[0-9]".toRegex()) }.toVal()

    val hasUnderscore = { pass: String -> pass.contains("_") }.toVal()
}