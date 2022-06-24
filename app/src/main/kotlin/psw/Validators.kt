package psw

internal object Validators {
    val hasUpperCase = { pass: String -> pass.contains("[A-Z]".toRegex()) }.toVal()

    val hasLowerCase = { pass: String -> pass.contains("[a-z]".toRegex()) }.toVal()

    fun maxLength(maxLength: Int) = { pass: String -> pass.length > maxLength }.toVal()

    val hasNumber = { pass: String -> pass.contains("[0-9]".toRegex()) }.toVal()

    val hasUnderscore = { pass: String -> pass.contains("_") }.toVal()
}