package kotlinInAction.chapter3

fun main() {
    saveUser(User(1, "", ""))
}

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id}: empty $fieldName")
        }
    }
//    if (user.name.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty name")
//    }
//    if (user.address.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty address")
//    }
    validate(name, "name")
    validate(address, "address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
}
