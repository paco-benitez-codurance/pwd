package psw

import psw.Validators.hasNumber
import psw.Validators.hasUnderscore
import psw.Validators.hasUpperCase
import psw.Validators.validLength


class PasswordValidator {

    private val validImp = validLength + hasUpperCase + hasNumber + hasUnderscore

    val valid = validImp.valid

}



