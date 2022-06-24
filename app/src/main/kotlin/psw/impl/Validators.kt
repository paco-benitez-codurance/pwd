package psw.impl


internal object Validators {

    private fun regexpValidator(reg: String): IsValid = { pass: String -> pass.contains(reg.toRegex()) }.toVal()

    val hasUpperCase = regexpValidator("[A-Z]")

    val hasLowerCase = regexpValidator("[a-z]")

    fun maxLength(maxLength: Int) = { pass: String -> pass.length > maxLength }.toVal()

    val hasNumber = regexpValidator("[0-9]")

    val hasUnderscore = { pass: String -> pass.contains("_") }.toVal()

}