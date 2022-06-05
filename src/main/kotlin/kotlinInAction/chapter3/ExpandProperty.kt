package kotlinInAction.chapter3

fun main() {
    val sb = StringBuilder("hello")
    println(sb.lastChar)
    sb.lastChar = '!'
}

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

class ExpandProperty() {
}
