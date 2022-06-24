package psw

import kotlin.test.Test
import kotlin.test.assertEquals

class PasswordValidatorTest {


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
