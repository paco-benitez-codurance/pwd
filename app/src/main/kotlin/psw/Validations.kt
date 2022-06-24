package psw

import psw.impl.Validators

internal object Validations {
    val valid1Imp =
        Validators.maxLength(8) + Validators.hasUpperCase + Validators.hasLowerCase + Validators.hasNumber + Validators.hasUnderscore
    val valid2Imp = Validators.maxLength(6) + Validators.hasUpperCase + Validators.hasLowerCase + Validators.hasNumber
    val valid3Imp = Validators.maxLength(16) + Validators.hasUpperCase + Validators.hasLowerCase + Validators.hasNumber
}