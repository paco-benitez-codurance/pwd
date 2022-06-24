package psw

inline fun ((String) -> Boolean).toVal(): IsValid = IsValid(this)
class IsValid(val valid: (String) -> Boolean) {
    operator fun plus(other: IsValid): IsValid {
        return IsValid { valid(it) && other.valid(it) }
    }
}