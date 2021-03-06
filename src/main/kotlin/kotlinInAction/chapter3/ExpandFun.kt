package kotlinInAction.chapter3

import java.lang.StringBuilder

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString(list, prefix = "# ", postfix = ";"))
    println(listOf("1", "2", "3").join(" "))
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
)= joinToString(separator, prefix, postfix)

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
