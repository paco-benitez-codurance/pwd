package psw

enum class Validation(internal val isValid: IsValid) {
    VALIDATION1(Validations.valid1Imp),
    VALIDATION2(Validations.valid2Imp),
    VALIDATION3(Validations.valid3Imp)
}

class PasswordValidator(validation: Validation) {
    val valid = validation.isValid.valid
}



