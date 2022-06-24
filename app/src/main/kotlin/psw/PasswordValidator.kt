package psw

import psw.Validators.hasLowerCase
import psw.Validators.hasNumber
import psw.Validators.hasUnderscore
import psw.Validators.hasUpperCase
import psw.Validators.maxLength


class PasswordValidator {

    private val validImp = maxLength(8) + hasUpperCase + hasLowerCase + hasNumber + hasUnderscore

    val valid = validImp.valid

}



