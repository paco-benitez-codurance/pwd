package psw

import kotlin.test.Test
import kotlin.test.assertEquals

class PasswordValidatorTest {
    private val passwordValidator = PasswordValidator()

    @Test fun passwordLessOrEqual8Length_shouldNot_be_valid() {
        val passLessOrEqual8 = "12345678"
        assertEquals(false, passwordValidator.valid(passLessOrEqual8))
    }

    @Test fun password_should_containsACapitalLetter() {
        val passAllLowerCase = "abcdefghij"
        assertEquals(false, passwordValidator.valid(passAllLowerCase))
    }

    @Test fun password_should_containsANumber() {
        val passAllLowerCase = "Abcdefghij"
        assertEquals(false, passwordValidator.valid(passAllLowerCase))
    }

    @Test fun password_should_containsUnderscore() {
        val passAllLowerCase = "A3bcdefghij"
        assertEquals(false, passwordValidator.valid(passAllLowerCase))
    }


    @Test fun validPassword_be_valid() {
        val validPassword = "_12345678A"
        assertEquals(true, passwordValidator.valid(validPassword))
    }
}
