package psw

class PasswordValidator {
    fun valid(pass: String): Boolean {
        if (!validLength(pass)) return false
        if (!hasUpperCase(pass)) return false
        if (!hasNumber(pass)) return false
        if (!hasUnderscore(pass)) return false
        return true
    }

    private fun hasUpperCase(pass: String) = pass.contains("[A-Z]".toRegex())

    private fun validLength(pass: String) = pass.length > 8

    private fun hasNumber(pass: String) = pass.contains("[0-9]".toRegex())

    private fun hasUnderscore(pass: String) = pass.contains("_")
}
