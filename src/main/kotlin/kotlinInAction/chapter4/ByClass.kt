package kotlinInAction.chapter4

fun main() {
    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1, 1, 2))
    println("${countingSet.objectsAdded} objects were added, ${countingSet.size} remain")

}

class CountingSet<T>(
    private val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}