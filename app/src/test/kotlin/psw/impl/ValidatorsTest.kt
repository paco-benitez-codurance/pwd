package psw.impl

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidatorsTest {

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

}
