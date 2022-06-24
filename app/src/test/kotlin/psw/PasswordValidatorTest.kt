package psw

import kotlin.test.Test
import kotlin.test.assertEquals

class PasswordValidatorTest {

    @Test fun passwordLessOrEqual8Length_shouldNot_be_valid() {
        val passLessOrEqual8 = "12345678"
        assertEquals(false, Validators.maxLength(8).valid(passLessOrEqual8))
    }

    @Test fun password_should_containsACapitalLetter() {
        val passAllLowerCase = "abcdefghij"
        assertEquals(false, Validators.hasUpperCase.valid(passAllLowerCase))
    }

    @Test fun password_should_containsALowerCaseLetter() {
        val passAllLowerCase = "ABC"
        assertEquals(false, Validators.hasLowerCase.valid(passAllLowerCase))
    }

    @Test fun password_should_containsANumber() {
        val passAllLowerCase = "Abcdefghij"
        assertEquals(false, Validators.hasNumber.valid(passAllLowerCase))
    }

    @Test fun password_should_containsUnderscore() {
        val passAllLowerCase = "A3bcdefghij"
        assertEquals(false, Validators.hasUnderscore.valid(passAllLowerCase))
    }


    @Test fun valid1Password_be_valid() {
        val passwordValidator = PasswordValidator(Validation.VALIDATION1)
        val validPassword = "_1234567aA"
        assertEquals(true, passwordValidator.valid(validPassword))
    }

    @Test fun valid2Password_be_valid() {
        val passwordValidator = PasswordValidator(Validation.VALIDATION2)
        val validPassword = "aA34567"
        assertEquals(true, passwordValidator.valid(validPassword))
    }

    @Test fun valid3Password_be_valid() {
        val passwordValidator = PasswordValidator(Validation.VALIDATION3)
        val validPassword = "aA345670123456789"
        assertEquals(true, passwordValidator.valid(validPassword))
    }

}
