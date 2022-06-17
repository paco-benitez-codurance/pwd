package psw

class PasswordValidator {
    fun valid(pass: String): Boolean {
        return pass.length > 8
    }

}
