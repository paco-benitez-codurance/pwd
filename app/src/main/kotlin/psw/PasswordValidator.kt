package psw

class PasswordValidator {
    fun valid(pass: String): Boolean {
        if (!validLength(pass)) return false
        if (!hasNotUpperCase(pass)) return false
        return true
    }

    private fun hasNotUpperCase(pass: String) = pass.contains("[A-Z]".toRegex())

    private fun validLength(pass: String): Boolean = pass.length > 8

}
